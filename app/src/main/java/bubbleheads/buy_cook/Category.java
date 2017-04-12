package bubbleheads.buy_cook;

public class Category {

    private final String name;
    private final int categoryID;

    public Category(final String name, final int id) {
        this.name = name;
        this.categoryID = id;
    }

    public String getName() {
        return name;
    }

    public int getCategoryID() {
        return categoryID;
    }
}