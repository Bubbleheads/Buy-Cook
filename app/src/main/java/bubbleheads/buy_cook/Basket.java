package bubbleheads.buy_cook;

import android.widget.Toast;

import java.util.HashMap;

public class Basket {

    private static final Basket INSTANCE = new Basket();

    public static Basket getInstance() {
        return INSTANCE;
    }

    private Basket() {
    }

    private HashMap<Ingredient, Integer> productsToBuy = new HashMap<>();

    public HashMap<Ingredient, Integer> getProductsToBuy() {
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
                        currentQuantity + currentQuantity * multiplier);
            } else {
                productsToBuy.put(ingredient, products.get(ingredient));
            }
        }
    }

    private void removeProducts(final HashMap<Ingredient, Integer> products, final int multiplier) {
        for (Ingredient ingredient : products.keySet()) {
            if (isPresent(ingredient)) {
                final int currentQuantity = productsToBuy.get(ingredient);
                productsToBuy.put(ingredient,
                        currentQuantity - currentQuantity * multiplier);
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

    public String show(){
        String result = "";
        for (Ingredient ingredient: productsToBuy.keySet()){
            result = result.concat(ingredient.getName() + " "
                    + productsToBuy.get(ingredient) + " " + ingredient.getMeasurement() + " ");
        }
        return result;
    }
}
