package bubbleheads.buy_cook;

public enum Measurement {
    MILLITER("ml"), TABLESPOON("tablespoon"), AMOUNT("amount"), TEASPOON("teaspoon"), GRAM("gram");
    private final String name;

    Measurement(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}