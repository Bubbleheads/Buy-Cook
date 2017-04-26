package bubbleheads.buy_cook;

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

    public void addProducts(HashMap<Ingredient, Integer> products, int multiplier) {
        for (Ingredient ingredient : products.keySet()) {
            if (isPresent(ingredient)) {
                final int currentQuantity = productsToBuy.get(containedIngredient);
                productsToBuy.put(containedIngredient,
                        currentQuantity + products.get(containedIngredient));
            } else {
                productsToBuy.put(ingredient, products.get(ingredient));
            }
        }
    }

    private boolean isPresent(Ingredient ingredient) {
        boolean result;
        for (Ingredient inListIngredient : productsToBuy.keySet()) {
            if (inListIngredient.getName().toUpperCase()
                    .contains(ingredient.getName().toUpperCase())) {
                result = true;
            }
        }
        return result;
    }
}
