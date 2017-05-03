package bubbleheads.buy_cook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Basket {

    private static final Basket INSTANCE = new Basket();

    public static Basket getInstance() {
        return INSTANCE;
    }

    private Basket() {
    }

    private Map<Ingredient, Integer> productsToBuy = new HashMap<>();

    public Map<Ingredient, Integer> getProductsToBuy() {
        return productsToBuy;
    }

    private HashMap<Recipe, Integer> portionQuantity = new HashMap<>();

    public HashMap<Recipe, Integer> getPortionQuantity() {
        return portionQuantity;
    }

    public void processProducts(final Recipe recipe,
                                final HashMap<Ingredient, Integer> products,
                                final int multiplier){
        if (isRecipeInList(recipe)){
            if (multiplier > portionQuantity.get(recipe)){
                addProducts(products, multiplier - portionQuantity.get(recipe));
            } else{
                removeProducts(products, portionQuantity.get(recipe) - multiplier);
            }
            portionQuantity.put(recipe, multiplier);
        }else {
            portionQuantity.put(recipe, multiplier);
            addProducts(products, multiplier);
        }
        deleteEmpty();
    }

    private void deleteEmpty(){
        Iterator<Map.Entry<Ingredient,Integer>> iter = productsToBuy.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Ingredient,Integer> entry = iter.next();
            if(entry.getValue() == 0){
                iter.remove();
            }
        }
    }

    private boolean isRecipeInList(final Recipe recipe){
        for (Recipe listRecipe: portionQuantity.keySet()){
            if (listRecipe.getRecipeName().equalsIgnoreCase(recipe.getRecipeName())){
                return true;
            }
        }
        return false;
    }

    private void addProducts(final HashMap<Ingredient, Integer> products, final int multiplier) {
        for (Ingredient ingredient : products.keySet()) {
            if (isPresent(ingredient)) {
                final int currentQuantity = productsToBuy.get(ingredient);
                productsToBuy.put(ingredient,
                        currentQuantity + products.get(ingredient) * multiplier);
            } else {
                productsToBuy.put(ingredient, products.get(ingredient) * multiplier);
            }
        }
    }

    private void removeProducts(final HashMap<Ingredient, Integer> products, final int multiplier) {
        for (Ingredient ingredient : products.keySet()) {
            if (isPresent(ingredient)) {
                final int currentQuantity = productsToBuy.get(ingredient);
                productsToBuy.put(ingredient,
                        currentQuantity - products.get(ingredient) * multiplier);
            }
        }
    }

    private boolean isPresent(final Ingredient ingredient) {
        for (Ingredient inListIngredient : productsToBuy.keySet()) {
            if (inListIngredient.equals(ingredient)){
                return true;
            }
        }
        return false;
    }

    public int getPortionQuantity(Recipe recipe){
        for (Recipe listRecipe: portionQuantity.keySet()){
            if (listRecipe.getRecipeName().equalsIgnoreCase(recipe.getRecipeName())){
                return portionQuantity.get(listRecipe);
            }
        }
        return 0;
    }

    public String show(){
        String result = "";
        for (Ingredient ingredient: productsToBuy.keySet()){
            result = result.concat(ingredient.getName() + " "
                    + productsToBuy.get(ingredient) + " " + ingredient.getMeasurement() + " ");
        }
        return result;
    }
}
