package bubbleheads.buy_cook;

public enum Measurement {
    MILLITER("ml"), TABLESPOON("tablespoon"), AMOUNT(" "), TEASPOON("teaspoon"), GRAM("grams"),
    POUND("pounds"), CUP("cups");
    private final String name;

    Measurement(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
