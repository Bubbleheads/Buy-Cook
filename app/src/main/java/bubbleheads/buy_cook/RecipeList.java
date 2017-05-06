package bubbleheads.buy_cook;

import java.util.ArrayList;
import java.util.HashMap;

public class RecipeList {

    private static final RecipeList INSTANCE = new RecipeList();

    public static RecipeList getInstance() {
        return INSTANCE;
    }

    private RecipeList() {
    }

    private final String borshtsh = "Crumble the sausage (if using) into a skillet over medium-high heat. " +
            "Cook and stir until no longer pink. Remove from the heat and set aside.\n" +
            "Fill a large pot halfway with water(about 2 quarts), and bring to a boil. Add the sausage, and cover the pot." +
            " Return to a boil. Add the beets, and cook until they have lost their color. Add the carrots and potatoes," +
            " and cook until tender, about 15 minutes. Add the cabbage, and the can of diced tomatoes.\n" +
            "Heat the oil in a skillet over medium heat. Add the onion, and cook until tender. Stir in the tomato paste" +
            " and water until well blended. Transfer to the pot. Add the raw garlic to the soup, cover and turn off the heat. " +
            "Let stand for 5 minutes. Taste, and season with salt, pepper and sugar.\n" +
            "Ladle into serving bowls, and garnish with sour cream, if desired, and fresh parsley.";
    private final String cream_soup = "Preheat an oven to 375 degrees F (190 degrees C). Line a rimmed baking sheet with parchment paper.\n" +
            "Cut squash in half lengthwise; discard seeds and membrane. Place squash halves, cut sides down, on the prepared baking sheet." +
            " Roast in preheated oven until very soft, about 45 minutes. Scoop the pulp from the peel, and reserve.\n" +
            "Melt butter in a large soup pot over medium heat. Stir in the onion, garlic, ginger, curry powder, and salt." +
            " Cook and stir until the onion is soft, about 10 minutes. Pour the chicken broth into the pot, and bring to a boil." +
            " Stir in the pears and the reserved squash, and simmer until the pears are very soft, about 30 minutes.\n" +
            "Pour the soup into a blender, filling the pitcher no more than halfway full. Hold down the lid of the blender" +
            " with a folded kitchen towel, and carefully start the blender. Puree in batches until smooth. Return the soup to the pot," +
            " stir in the half and half, and reheat.";
    private final String mushroom = "Cut the mushrooms into slices.\n" +
            "Melt butter in large frying pan. Add in onions, garlic, and mushrooms. Cook until onions are soft.\n" +
            "Blend in 2 T. flour and stir.\n" +
            "Add in the chicken broth and heat until slightly thickened while stirring frequently.\n" +
            "Stir cream with additional 1 T. flour and seasonings. Add in cream to soup. Heat to thicken while stirring frequently.";
    private final String pizza_how_to_cook = "Preheat oven to 450 degrees F (230 degrees C)." +
            " In a medium bowl, dissolve yeast and sugar in warm water. Let stand until creamy, about 10 minutes.\n" +
            "Stir in flour, salt and oil. Beat until smooth. Let rest for 5 minutes.\n" +
            "Turn dough out onto a lightly floured surface and pat or roll into a round. " +
            "Transfer crust to a lightly greased pizza pan or baker's peel dusted with cornmeal." +
            " Spread with desired toppings and bake in preheated oven for 15 to 20 minutes, or until golden brown. " +
            "Let baked pizza cool for 5 minutes before serving.";
    private final HashMap<Ingredient, Integer> borshtch = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Pork", Measurement.GRAM), 500);
            put(new Ingredient("Carrot", Measurement.AMOUNT), 3);
            put(new Ingredient("Baking potatoes", Measurement.AMOUNT), 3);
            put(new Ingredient("Vegetable oil", Measurement.TABLESPOON), 1);
            put(new Ingredient("Cabbage", Measurement.AMOUNT), 1);
            put(new Ingredient("Tomatoes", Measurement.AMOUNT), 2);
            put(new Ingredient("Garlic", Measurement.AMOUNT), 1);
            put(new Ingredient("White sugar", Measurement.TEASPOON), 1);
            put(new Ingredient("Onion", Measurement.AMOUNT), 1);
            put(new Ingredient("Tomato paste", Measurement.TABLESPOON), 6);
        }
    };
    private final HashMap<Ingredient, Integer> soup = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("squash", Measurement.TABLESPOON), 1);
            put(new Ingredient("squash", Measurement.TABLESPOON), 1);
            put(new Ingredient("unsalted butter", Measurement.TABLESPOON), 3);
            put(new Ingredient("onion", Measurement.AMOUNT), 1);
            put(new Ingredient("garlic", Measurement.AMOUNT), 2);
            put(new Ingredient("ginger", Measurement.TABLESPOON), 2);
            put(new Ingredient("squash", Measurement.TABLESPOON), 1);
            put(new Ingredient("curry powder", Measurement.TEASPOON), 1);
        }
    };
    private final HashMap<Ingredient, Integer> mushroom_soup = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Fresh mushrooms", Measurement.AMOUNT), 12);
            put(new Ingredient("Onion", Measurement.TABLESPOON), 2);
            put(new Ingredient("Garlic", Measurement.AMOUNT), 1);
            put(new Ingredient("Butter", Measurement.TABLESPOON), 2);
            put(new Ingredient("Tomatoes", Measurement.AMOUNT), 2);
            put(new Ingredient("Garlic", Measurement.AMOUNT), 1);
        }
    };

    private final HashMap<Ingredient, Integer> pizza = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Dry yeast", Measurement.AMOUNT), 1);
            put(new Ingredient("White sugar", Measurement.TEASPOON), 1);
            put(new Ingredient("Bread flour", Measurement.TABLESPOON), 12);
            put(new Ingredient("Olive oil", Measurement.TABLESPOON), 2);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
        }
    };
    private final ArrayList<Recipe> recipes = new ArrayList<Recipe>() {
        {
            add(new Recipe("Curry soup", "curry,salt", R.drawable.cream_soup, 1, cream_soup, "1.5hours", soup, "3"));
            add(new Recipe("Ukrainian red borscht", "tasty", R.drawable.borschtsh, 1, borshtsh, "1 hour", borshtch, "2"));
            add(new Recipe("Mushroom soup", "cream", R.drawable.mushroom_soup, 1, mushroom, "1 hour", mushroom_soup, "3"));
            add(new Recipe("Pizza with pepperoni","pizza", R.drawable.pepperoni_pizza, 2, pizza_how_to_cook, "30min", pizza, "1"));
        }
    };

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void toggleFavoriteInList(Recipe recipe) {
        for (Recipe inListRecipe : recipes) {
            if (recipe.getRecipeName().equals(inListRecipe.getRecipeName())) {
                inListRecipe.toggleFavorite();
            }
        }
    }
}