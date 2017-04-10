package bubbleheads.buy_cook;

public class Category {

    private static int globalID = 0;
    private final String name;
    private final int categoryID;

    public Category(final String name) {
        this.name = name;
        this.categoryID = ++globalID;
    }

    public String getName() {
        return name;
    }

    public int getCategoryID() {
        return categoryID;
    }
}