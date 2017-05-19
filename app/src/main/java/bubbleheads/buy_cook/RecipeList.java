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
    private final String banana_cocktail_how_to_cook = "In a container of a blender, combine coconut rum," +
            " peach schapps, vanilla ice cream and vanilla extract. Cover and blend until smooth. ";
    private final String iced_coffee_how_to_cook = "In a small bowl, stir together the " +
            "water and instant coffee. In a blender, combine ice cubes, coffee mixture," +
            " milk, sweetened condensed milk and" +
            " chocolate syrup. Blend until smooth. Pour into glasses and serve.";
    private final String chocolate_cake_how_to_cook = "Preheat oven to 350 degrees F (175 degrees C).\n" +
            "In a large bowl, mix together the cake and pudding mixes, sour cream, oil, beaten eggs and water. Stir in the chocolate chips and pour batter into a well greased 12 cup bundt pan.\n" +
            "Bake for 50 to 55 minutes, or until top is springy to the touch and a wooden toothpick inserted comes out clean. Cool cake thoroughly in pan at least an hour and a half before inverting " +
            "onto a plate If desired, dust the cake with powdered sugar.";
    private final String ginger_cookies_how_to_cook = "Preheat oven to 350 degrees F (175 degrees C)." +
            " Sift together the flour, ginger, baking soda, cinnamon, cloves, and salt. Set aside.\n" +
            "In a large bowl, cream together the margarine and 1 cup sugar until light and" +
            " fluffy. Beat in the egg, then stir in the water and molasses. Gradually stir" +
            " the sifted ingredients into the molasses mixture. Shape dough into walnut " +
            "sized balls, and roll them in the remaining 2 tablespoons of sugar. Place " +
            "the cookies 2 inches apart onto an ungreased cookie sheet, and flatten slightly.\n" +
            "Bake for 8 to 10 minutes in the preheated oven. Allow cookies to cool on baking sheet for 5 minutes before removing to a wire rack to cool completely. Store in an airtight container.";
    private final String blueberry_smoothie_how_to_cook = "Combine blueberry juice cocktail" +
            " and blueberries in a blender.\n" +
            "Cover; blend on high speed until mixture is smooth.\n" +
            "Add yogurt; blend until thoroughly combined.";
    private final String caesar_how_to_cook = "Mince 3 cloves of garlic, and combine in a small bowl " +
            "with mayonnaise, anchovies, 2 tablespoons of the Parmesan cheese, Worcestershire sauce, mustard," +
            " and lemon juice. Season to taste with salt and black pepper. Refrigerate until ready to use.\n" +
            "Heat oil in a large skillet over medium heat. Cut the remaining 3 cloves of garlic into quarters," +
            " and add to hot oil. Cook and stir until brown, and then remove garlic from pan. Add bread cubes" +
            " to the hot oil. Cook, turning frequently, until lightly browned. Remove bread cubes from oil, " +
            "and season with salt and pepper.\n" +
            "Place lettuce in a large bowl. Toss with dressing, remaining Parmesan cheese, and seasoned bread cubes. ";
    private final String roast_chicken_how_to_cook = "Preheat oven to 375 degrees F (190 degrees C). " +
            "Lightly grease a medium baking dish.\n" +
            "Pierce lemons several times with a fork, and place 1 inside each chicken cavity. Arrange" +
            " chickens in the center of the prepared baking dish. Place onions, shallots, and garlic " +
            "around the chickens. Sprinkle vegetables with olive oil, and season with salt and pepper." +
            " Spread butter over the chickens, and line each with thyme sprigs.\n" +
            "Bake 20 minutes in the preheated oven. Increase temperature to 400 degrees F (200 degrees C)," +
            " and continue baking 30 minutes, or until exterior of chicken is golden brown, meat is no longer " +
            "pink, and juices run clear. Allow to cool about 15 minutes before serving.";
    private final String cream_soup = "Preheat an oven to 375 degrees F (190 degrees C). Line a rimmed baking sheet with parchment paper.\n" +
            "Cut squash in half lengthwise; discard seeds and membrane. Place squash halves, cut sides down, on the prepared baking sheet." +
            " Roast in preheated oven until very soft, about 45 minutes. Scoop the pulp from the peel, and reserve.\n" +
            "Melt butter in a large soup pot over medium heat. Stir in the onion, garlic, ginger, curry powder, and salt." +
            " Cook and stir until the onion is soft, about 10 minutes. Pour the chicken broth into the pot, and bring to a boil." +
            " Stir in the pears and the reserved squash, and simmer until the pears are very soft, about 30 minutes.\n" +
            "Pour the soup into a blender, filling the pitcher no more than halfway full. Hold down the lid of the blender" +
            " with a folded kitchen towel, and carefully start the blender. Puree in batches until smooth. Return the soup to the pot," +
            " stir in the half and half, and reheat.";
    private final String cookie_pralines_how_to_cook = "Preheat oven to 275 degrees F (135 degrees C). Grease a baking sheet or line it with parchment paper.\n" +
            "Whisk sugar, flour, and salt; set aside.\n" +
            "In separate bowl, beat egg white until stiff. Fold sugar mixture into stiffened egg white. Add pecans and vanilla. Stir gently.\n" +
            "Drop by teaspoonfuls onto prepared baking sheet. Bake in preheated oven until browned, 25 to 30 minutes. Cool 5 minutes on baking " +
            "sheet, then remove to wire rack to cool completely.";
    private final String carrot_cake_how_to_cook = "Preheat oven to 350 degrees F (175 degrees C). Grease and flour a 9x13 inch pan.\n" +
            "In a large bowl, beat together eggs, oil, white sugar and 2 teaspoons vanilla. Mix in flour, baking soda, baking powder, salt and cinnamon. Stir in carrots. Fold in pecans. Pour into prepared pan.\n" +
            "Bake in the preheated oven for 40 to 50 minutes, or until a toothpick inserted into the center of the cake comes out clean. Let cool in pan for 10 minutes, then turn out onto a wire rack and cool completely.\n" +
            "To Make Frosting: In a medium bowl, combine butter, cream cheese, confectioners' sugar and 1 teaspoon vanilla. Beat until the mixture is smooth and creamy. Stir in chopped pecans. Frost the cooled cake.";
    private final String margarita_how_to_cook = "Place a pizza stone or tiles on the middle " +
            "rack of your oven and turn heat to its highest setting. Let it heat for at least an hour.\n" +
            "Put the sauce in the center of the stretched dough and use the back of a spoon to" +
            " spread it evenly across the surface, stopping approximately 1/2 inch from the edges.\n" +
            "Drizzle a little olive oil over the pie. Break the cheese into large pieces and " +
            "place these gently on the sauce. Scatter basil leaves over the top.\n" +
            "Using a pizza peel, pick up the pie and slide it onto the heated stone or tiles in " +
            "the oven. Bake until the crust is golden brown and the cheese is bubbling, approximately 4 to 8 minutes.";
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
    private final String pancakes_how_to_cook = "Combine milk with vinegar in a medium bowl and set aside for 5 minutes to \"sour\".\n" +
            "Combine flour, sugar, baking powder, baking soda, and salt in a large mixing bowl. Whisk" +
            " egg and butter into \"soured\" milk. " +
            "Pour the flour mixture into the wet ingredients and whisk until lumps are gone.\n" +
            "Heat a large skillet over medium heat, and coat with cooking spray. Pour 1/4 cupfuls of batter onto the skillet, and cook until bubbles appear on the surface. Flip with a spatula, and cook until browned on the other side.";
    private final String cupcakes_how_to_cook ="Preheat oven to 350 degrees F (175 degrees C).\n" +
            "Line 24 muffin cups with paper liners.\n" +
            "Beat cake mix, water, canola oil, and egg whites in a large bowl with an electric mixer at low speed until moistened. Increase speed to medium and continue beating for 2 more minutes.\n" +
            "Fold marshmallows, butterscotch chips, chocolate covered toffee, chocolate chips, and flaked coconut into the cake batter.\n" +
            "Fill prepared muffin cups 2/3 to 3/4 full with batter.\n" +
            "Bake in the preheated oven until cupcakes are golden brown and set, about 15 to 25 minutes.\n" +
            "Cool in the pans for 10 minutes before removing to cool completely on a wire rack.\n" +
            "Fill a pastry bag fitted with a star tip with peanut butter.\n" +
            "Gently insert star tip into the center of each cupcake; squeeze a small amount of peanut butter into the cupcake.";
    private final String roasted_pork_how_to_cook = "Preheat oven to 350 degrees F (175 degrees C).\n" +
            "Crush garlic with rosemary, salt and pepper, making a paste. Pierce meat with a sharp knife in several" +
            " places and press the garlic paste into the openings. Rub the meat with the remaining garlic mixture and " +
            "olive oil.\n" +
            "Place pork loin into oven, turning and basting with pan liquids. Cook until the pork is no longer " +
            "pink in the center, about 1 hour. An instant-read thermometer inserted into the center should read " +
            "145 degrees F (63 degrees C). Remove roast to a platter. Heat the wine in the pan and stir to loosen " +
            "browned bits of food on the bottom. Serve with pan juices.";
    private final String greek_salad_how_to_cook = "In a large salad bowl, combine the Romaine, onion," +
            " olives, bell peppers, tomatoes, cucumber and cheese.\n" +
            "Whisk together the olive oil, oregano, lemon juice and black pepper. Pour dressing over salad, " +
            "toss and serve.";
    private final String cocoa_how_to_cook = "Combine the cocoa, sugar and pinch of salt in a saucepan. " +
            "Blend in the boiling water. Bring this mixture to an easy boil while you stir. Simmer and stir for about 2 minutes. " +
            "Watch that it doesn't scorch. Stir in 3 1/2 cups of milk and heat until very hot, but do not boil! " +
            "Remove from heat and add vanilla. Divide between 4 mugs. " +
            "Add the cream to the mugs of cocoa to cool it to drinking temperature.";
    private final String christmas_cake_how_to_cook = "Preheat oven to 350 degrees F (175 degrees C). Grease one 11 inch loaf pan.\n" +
            "Cream the butter or margarine and the sugar until light and fluffy. Add the eggs one at time beating well after each one. Stir in the milk, lemon and cardamom flavorings. Stir in the flour and the baking powder.\n" +
            "Sift a little flour over the raisins then stir them into the batter. Pour the batter into the prepared pan.\n" +
            "Bake at 350 degrees F (175 degrees C) for 55 to 60 minutes.";
    private final String peanut_butter_cup_cookie = "Preheat oven to 375 degrees F (190 degrees C). Sift together the flour, salt and baking soda; set aside.\n" +
            "Cream together the butter, sugar, peanut butter and brown sugar until fluffy. Beat in the egg, vanilla and milk. Add the flour mixture; mix well. Shape into 40 balls and place each into an ungreased mini muffin pan.\n" +
            "Bake at 375 degrees for about 8 minutes. Remove from oven and immediately press a mini peanut butter cup into each ball. Cool and carefully remove from pan.";
    private final String beef_steak_how_to_cook = "Season steak generously with salt and black pepper on both sides.\n" +
            "Place wood chips in the smoker box of your gas grill according to manufacturer's instructions.\n" +
            "Preheat one side of the grill to about 250 degrees F (121 degrees C).\n" +
            "Place steak on the cool side of the grill. Cook until an instant-read thermometer inserted " +
            "into the center reads about 100 degrees F (37 degrees C), 25 to 30 minutes." +
            " Transfer steak to a plate. Brush with olive oil and cover with aluminum foil.\n" +
            "Increase heat on the grill to 600 degrees F (315 degrees C) by turning both" +
            " burners up to maximum.\n" +
            "Cook steak until crust forms and an instant-read thermometer inserted into the " +
            "center reads 125 degrees F (52 degrees C), about 3 minutes per side. Transfer steak " +
            "back to plate. Cover with aluminum foil and let rest before serving, about 5 minutes.";
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
    private final HashMap<Ingredient, Integer> carrot_cake_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Egg", Measurement.AMOUNT), 4);
            put(new Ingredient("Vegetable oil", Measurement.CUP), 1);
            put(new Ingredient("White sugar", Measurement.CUP), 2);
            put(new Ingredient("Vanilla extract", Measurement.TEASPOON), 2);
            put(new Ingredient("Flour", Measurement.CUP), 2);
            put(new Ingredient("Baking soda", Measurement.TEASPOON), 2);
            put(new Ingredient("Baking powder", Measurement.TEASPOON), 2);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Chopped pecans", Measurement.CUP), 1);
            put(new Ingredient("Butter", Measurement.CUP), 1);
            put(new Ingredient("Cream cheese", Measurement.TEASPOON), 8);
            put(new Ingredient("Vanilla extract", Measurement.TEASPOON), 1);
            put(new Ingredient("Chopped pecans", Measurement.CUP), 1);
        }
    };
    private final HashMap<Ingredient, Integer> ginger_cookies_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Flour", Measurement.CUP), 2);
            put(new Ingredient("Ginger", Measurement.TEASPOON), 2);
            put(new Ingredient("Baking soda", Measurement.TEASPOON), 1);
            put(new Ingredient("Cannamon", Measurement.TEASPOON), 1);
            put(new Ingredient("Ground clover", Measurement.TEASPOON), 1);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Margarine", Measurement.CUP), 1);
            put(new Ingredient("Egg", Measurement.AMOUNT), 1);
            put(new Ingredient("Water", Measurement.TABLESPOON), 1);
            put(new Ingredient("Molasses", Measurement.TABLESPOON), 3);
            put(new Ingredient("White sugar",Measurement.TABLESPOON),2);
        }
    };
    private final HashMap<Ingredient, Integer> christmas_cake_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("White sugar", Measurement.CUP), 1);
            put(new Ingredient("Butter", Measurement.CUP), 1);
            put(new Ingredient("Egg", Measurement.AMOUNT), 2);
            put(new Ingredient("Flour", Measurement.CUP), 2);
            put(new Ingredient("Baking powder", Measurement.TEASPOON), 2);
            put(new Ingredient("Milk", Measurement.CUP), 1);
            put(new Ingredient("Raisins", Measurement.CUP), 1);
            put(new Ingredient("Lemon extract", Measurement.TEASPOON), 1);
            put(new Ingredient("Cardamom flavored extract", Measurement.TEASPOON), 1);
        }
    };
    private final HashMap<Ingredient, Integer> peanut_butter_cup_cookies_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Flour", Measurement.CUP), 2);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Baking soda", Measurement.TEASPOON), 1);
            put(new Ingredient("Butter", Measurement.CUP), 1);
            put(new Ingredient("White sugar", Measurement.CUP), 1);
            put(new Ingredient("Brown sugar", Measurement.CUP), 1);
            put(new Ingredient("Egg", Measurement.AMOUNT), 1);
            put(new Ingredient("Vanilla extract", Measurement.TEASPOON), 1);
            put(new Ingredient("Milk", Measurement.TABLESPOON), 2);
            put(new Ingredient("Peanut butter cups",Measurement.AMOUNT),40);
        }
    };
    private final HashMap<Ingredient, Integer> cookie_pralines_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Brown sugar", Measurement.CUP), 1);
            put(new Ingredient("Flour", Measurement.TABLESPOON), 1);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Egg", Measurement.AMOUNT), 1);
            put(new Ingredient("Vanilla extract", Measurement.TEASPOON), 1);
            put(new Ingredient("Chopped pecans", Measurement.CUP), 2);
        }
    };
    private final HashMap<Ingredient, Integer> chicken_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Lemon", Measurement.AMOUNT), 2);
            put(new Ingredient("Chicken", Measurement.AMOUNT), 1);
            put(new Ingredient("Onion", Measurement.AMOUNT), 2);
            put(new Ingredient("Shallots", Measurement.AMOUNT), 6);
            put(new Ingredient("Garlic", Measurement.AMOUNT), 8);
            put(new Ingredient("Olive oil", Measurement.TABLESPOON), 3);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Butter", Measurement.TEASPOON), 5);
            put(new Ingredient("Thyme", Measurement.AMOUNT), 6);
        }
    };
    private final HashMap<Ingredient, Integer> chocolate_cake_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Cake mix", Measurement.AMOUNT), 1);
            put(new Ingredient("Chocolate pudding mix", Measurement.AMOUNT), 1);
            put(new Ingredient("Sour cream", Measurement.CUP), 1);
            put(new Ingredient("Vegetable oil", Measurement.CUP), 1);
            put(new Ingredient("Egg", Measurement.AMOUNT), 4);
            put(new Ingredient("Olive oil", Measurement.TABLESPOON), 3);
            put(new Ingredient("Warm water", Measurement.CUP), 1);
            put(new Ingredient("Chocolate chips", Measurement.CUP), 2);
        }
    };
    private final HashMap<Ingredient, Integer> cupcakes_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("White cake mix", Measurement.AMOUNT), 1);
            put(new Ingredient("Water", Measurement.CUP), 1);
            put(new Ingredient("Canola oil", Measurement.CUP), 1);
            put(new Ingredient("Large egg", Measurement.AMOUNT), 3);
            put(new Ingredient("Marshmallows", Measurement.CUP), 1);
            put(new Ingredient("Butterscotch chips", Measurement.CUP), 1);
            put(new Ingredient("Chocolate chips", Measurement.CUP), 1);
            put(new Ingredient("Flaked coconut", Measurement.TEASPOON), 5);
            put(new Ingredient("Peanut buffer", Measurement.CUP), 2);
        }
    };
    private final HashMap<Ingredient, Integer> pancakes_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Milk", Measurement.CUP), 1);
            put(new Ingredient("White vinegar", Measurement.TABLESPOON), 2);
            put(new Ingredient("Flour", Measurement.CUP), 1);
            put(new Ingredient("White sugar", Measurement.TABLESPOON), 2);
            put(new Ingredient("Baking powder", Measurement.TEASPOON), 1);
            put(new Ingredient("Baking soda", Measurement.TEASPOON), 1);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Egg", Measurement.TEASPOON), 1);
            put(new Ingredient("Melted butter", Measurement.TABLESPOON), 2);
        }
    };
    private final HashMap<Ingredient, Integer> banana_cocktail_ingreients= new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Banana liquer", Measurement.CUP), 1);
            put(new Ingredient("Peach schapps", Measurement.TABLESPOON), 2);
            put(new Ingredient("Vanilla ice cream", Measurement.CUP), 2);
            put(new Ingredient("Vanilla extract", Measurement.TEASPOON), 1);
        }
    };
    private final HashMap<Ingredient, Integer> blueberry_smoothie_ingredients= new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Blueberry juice", Measurement.CUP), 1);
            put(new Ingredient("Fresh blueberries ", Measurement.CUP), 1);
            put(new Ingredient("Vanilla yogurt", Measurement.CUP), 1);
        }
    };
    private final HashMap<Ingredient, Integer> soup = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("squash", Measurement.TABLESPOON), 1);
            put(new Ingredient("unsalted butter", Measurement.TABLESPOON), 3);
            put(new Ingredient("onion", Measurement.AMOUNT), 1);
            put(new Ingredient("garlic", Measurement.AMOUNT), 2);
            put(new Ingredient("ginger", Measurement.TABLESPOON), 2);
            put(new Ingredient("curry powder", Measurement.TEASPOON), 1);
        }
    };
    private final HashMap<Ingredient, Integer> iced_coffee_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Warm water", Measurement.CUP), 1);
            put(new Ingredient("Coffee granules", Measurement.TABLESPOON), 2);
            put(new Ingredient("Ice cubes", Measurement.AMOUNT), 6);
            put(new Ingredient("Sweetened condensed milk", Measurement.CUP), 1);
            put(new Ingredient("Milk", Measurement.CUP), 1);
            put(new Ingredient("cChocolate syrup", Measurement.TABLESPOON), 1);
        }
    };
    private final HashMap<Ingredient, Integer> cocoa_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("cocoa powder", Measurement.TABLESPOON), 3);
            put(new Ingredient("white sugar", Measurement.CUP), 1);
            put(new Ingredient("salt", Measurement.TEASPOON), 1);
            put(new Ingredient("water", Measurement.CUP), 1);
            put(new Ingredient("milk", Measurement.CUP), 2);
            put(new Ingredient("Vanilla extract", Measurement.TEASPOON), 1);
            put(new Ingredient("Cream",Measurement.CUP),1);
        }
    };
    private final HashMap<Ingredient, Integer> caesar_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Garlic", Measurement.AMOUNT), 6);
            put(new Ingredient("Mayinnaise", Measurement.TABLESPOON), 6);
            put(new Ingredient("Anchovy fillets", Measurement.AMOUNT), 5);
            put(new Ingredient("Parmesan", Measurement.TABLESPOON), 6);
            put(new Ingredient("Worcestershire sauce", Measurement.TEASPOON), 1);
            put(new Ingredient("Lemon juice", Measurement.TABLESPOON), 1);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Olive oil", Measurement.TEASPOON), 7);
            put(new Ingredient("Day-old bread", Measurement.GRAM), 50);

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
    private final HashMap<Ingredient, Integer> greek_salad_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Red onion", Measurement.AMOUNT), 1);
            put(new Ingredient("Black olives", Measurement.TABLESPOON), 5);
            put(new Ingredient("Green bell pepper", Measurement.AMOUNT), 1);
            put(new Ingredient("Cucumber", Measurement.AMOUNT), 1);
            put(new Ingredient("Tomatoes", Measurement.AMOUNT), 2);
            put(new Ingredient("Dried oregano ", Measurement.TEASPOON), 1);
            put(new Ingredient("Black pepper", Measurement.TEASPOON), 1);
        }
    };
    private final HashMap<Ingredient, Integer> beef_steak_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Steak", Measurement.AMOUNT), 2);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Black pepper", Measurement.GRAM), 3);
            put(new Ingredient("Olive oil", Measurement.TEASPOON), 8);
            put(new Ingredient("Garlic", Measurement.AMOUNT), 1);
        }
    };
    private final HashMap<Ingredient, Integer> pizza_margarita = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Bread flour", Measurement.GRAM), 300);
            put(new Ingredient("Yeast", Measurement.TABLESPOON), 1);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Olive oil", Measurement.TABLESPOON), 1);
            put(new Ingredient("Passata", Measurement.MILLITER), 100);
            put(new Ingredient("Garlic", Measurement.AMOUNT), 1);
            put(new Ingredient("Parmezan", Measurement.GRAM), 125);
            put(new Ingredient("Cherry tomatoes", Measurement.AMOUNT), 6);
        }
    };

    private final HashMap<Ingredient, Integer> roasted_pork_ingredients = new HashMap<Ingredient, Integer>() {
        {
            put(new Ingredient("Garlic", Measurement.AMOUNT), 3);
            put(new Ingredient("Rosemary", Measurement.TABLESPOON), 1);
            put(new Ingredient("Salt", Measurement.TEASPOON), 1);
            put(new Ingredient("Boneless pork", Measurement.GRAM), 700);
            put(new Ingredient("Olive oil", Measurement.MILLITER), 100);
            put(new Ingredient("White whine", Measurement.MILLITER), 200);
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
            add(new Recipe("Iced coffee", "coffee",R.drawable.iced_coffee,6,iced_coffee_how_to_cook,"20min",iced_coffee_ingredients,"2"));
            add(new Recipe("Blueberry smoothie","smoothie",R.drawable.blueberry_smoothie,6,blueberry_smoothie_how_to_cook,"10min",blueberry_smoothie_ingredients,"1"));
            add(new Recipe("Banana cocktail","banana",R.drawable.banana_cocktail,6,banana_cocktail_how_to_cook,"5 min",banana_cocktail_ingreients,"2"));
            add(new Recipe("Cocoa cocktail","cocoa",R.drawable.cocoa,6,cocoa_how_to_cook,"2min",cocoa_ingredients,"1"));
            add(new Recipe("Ukrainian red borscht", "tasty", R.drawable.borschtsh, 1, borshtsh, "1 hour", borshtch, "2"));
            add(new Recipe("Mushroom soup", "cream", R.drawable.mushroom_soup, 1, mushroom, "1 hour", mushroom_soup, "3"));
            add(new Recipe("Caesar", "salad", R.drawable.caesar, 4, caesar_how_to_cook, "1hour", caesar_ingredients, "1"));
            add(new Recipe("Greek salad", "salad", R.drawable.greek_salad, 4, greek_salad_how_to_cook, "30min", greek_salad_ingredients, "2"));
            add(new Recipe("Chicken", "chicken", R.drawable.chicken, 3, roast_chicken_how_to_cook, "1.5h", chicken_ingredients, "5"));
            add(new Recipe("Beef steak", "steak", R.drawable.beef_recipe, 3, beef_steak_how_to_cook, "45min", beef_steak_ingredients, "4"));
            add(new Recipe("Cupcakes","cupcakes",R.drawable.cupcakes,7,cupcakes_how_to_cook,"1.5hour",cupcakes_ingredients,"4"));
            add(new Recipe("Pancakes","pancakes",R.drawable.pancakes,7,pancakes_how_to_cook,"30min",pancakes_ingredients,"3"));
            add(new Recipe("Ginger cookies","cookies",R.drawable.ginger_cookies,8,ginger_cookies_how_to_cook,"50min",ginger_cookies_ingredients,"4"));
            add(new Recipe("Cookie pralines","cookie",R.drawable.cookie_pralines,8,cookie_pralines_how_to_cook,"50min",cookie_pralines_ingredients,"3"));
            add(new Recipe("Peanut butter cup cookies","cookie",R.drawable.peanut_butter_cookie,8,peanut_butter_cup_cookie,"1,5hour",peanut_butter_cup_cookies_ingredients,"3"));
            add(new Recipe("Irelandic Christmas Cake","cake",R.drawable.christmas_cake,9,christmas_cake_how_to_cook,"2hour",christmas_cake_ingredients,"3"));
            add(new Recipe("Pizza Margarita", "pizza", R.drawable.margarita, 2, margarita_how_to_cook, "20min", pizza_margarita, "3"));
            add(new Recipe("Pizza with pepperoni", "pizza", R.drawable.pepperoni_pizza, 2, pizza_how_to_cook, "30min", pizza, "1"));
            add(new Recipe("Carrot cake","cake",R.drawable.carrot_cake,9,carrot_cake_how_to_cook,"2hour",carrot_cake_ingredients,"4"));
            add(new Recipe("Chocolate cake","cake",R.drawable.chocolate_cake,9,chocolate_cake_how_to_cook,"40min",chocolate_cake_ingredients,"5"));
            add(new Recipe("Roasted pork", "pork", R.drawable.pork, 3, roasted_pork_how_to_cook, "2hours", roasted_pork_ingredients, "2"));
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