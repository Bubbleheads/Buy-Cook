package bubbleheads.buy_cook;

import java.util.ArrayList;

public class CategoryList {

    private static final CategoryList categoryInstance = new CategoryList();

    public static CategoryList getCategoryInstance() {return categoryInstance;}

    private final ArrayList<Category> CATEGORY_LIST
            = new ArrayList<Category>() {
        {
            add(new Category("Soups", 1)); //1
            add(new Category("Pizza", 2)); //2
            add(new Category("Meat", 3)); //3
            add(new Category("Salads", 4)); //4
            add(new Category("Lunch", 5)); //5
            add(new Category("Main dishes", 6)); //6
            add(new Category("Drinks", 7)); //7
            add(new Category("Desserts", 8)); //8
            add(new Category("Cookies", 9)); //9
            add(new Category("Cakes", 10)); //10
            add(new Category("Pies", 11)); //11
            add(new Category("Vegan", 12)); //12
            add(new Category("Vegeterian", 13)); //13
        }
    };

    public ArrayList<Category> getCategoryList() {
        return CATEGORY_LIST;
    }

    public Category getCategory(final int categoryID) {
        for (final Category category : CATEGORY_LIST) {
            if (category.getCategoryID() == categoryID) {
                return category;
            }
        }
        return null;
    }
}
