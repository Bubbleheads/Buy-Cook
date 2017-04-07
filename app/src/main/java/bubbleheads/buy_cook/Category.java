package bubbleheads.buy_cook;

public enum Category {

    SOUPS("Soups"), PIZZA("Pizza"), MEAT("Meat"), SALADS("Salads"),
    LUNCH("Lunch"), MAIN_DISHES("Main dishes"), DRINKS("Drinks"),
    DESSERTS("Desserts"), COOKIES("Cookies"), CAKES("Cakes"),
    PIES("Pies"), VEGAN("Vegan"), VEGETERIAN("Vegeterian");

    private final String name;

    Category(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}