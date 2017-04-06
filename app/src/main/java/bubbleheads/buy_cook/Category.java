package bubbleheads.buy_cook;

public class Category {

    private final String name;
    private final int categoryID;
    private static int globalID = 0;

    Category(final String name) {
        this.name = name;
        globalID++;
        this.categoryID = globalID;
    }

    Category() {
        this.name = "";
        this.categoryID = 0;
    }

    public String getName() {
        return name;
    }

    public int getCategoryID() {
        return categoryID;
    }
}