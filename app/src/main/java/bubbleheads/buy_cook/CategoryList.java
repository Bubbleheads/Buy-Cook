package bubbleheads.buy_cook;

import java.util.ArrayList;

public class CategoryList {

    private static final ArrayList<Category> CATEGORY_LIST = new ArrayList<Category>() {
        {
            add(new Category("Soups")); //1
            add(new Category("Pizza")); //2
            add(new Category("Meat")); //3
            add(new Category("Salads")); //4
            add(new Category("Lunch")); //5
            add(new Category("Main dishes")); //6
            add(new Category("Drinks")); //7
            add(new Category("Desserts")); //8
            add(new Category("Cookies")); //9
            add(new Category("Cakes")); //10
            add(new Category("Pies")); //11
            add(new Category("Vegan")); //12
            add(new Category("Vegeterian")); //13
        }
    };

    public ArrayList<Category> getCategoryList() {
        return CATEGORY_LIST;
    }

    public Category getCategory(final int categoryID) {
        Category findCategory = new Category();
        for (Category category : CATEGORY_LIST) {
            if (category.getCategoryID() == categoryID) {
                findCategory = category;
            }
        }
        return findCategory;
    }
}
