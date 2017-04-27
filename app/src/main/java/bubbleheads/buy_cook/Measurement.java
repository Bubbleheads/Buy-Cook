package bubbleheads.buy_cook;

/**
 * Created by MARVIN on 27.04.2017.
 */

public enum Measurement {
    MILLITER("ml"),TABLESPOON("tablespoon"), AMOUNT("amount"), TEASPOON("teaspoon"), GRAM("gram");
    private final String name;
    Measurement(final String name) {this.name = name;}
    public String getName() {return name;}
}
