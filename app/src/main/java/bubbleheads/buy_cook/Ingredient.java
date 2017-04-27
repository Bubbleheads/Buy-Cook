package bubbleheads.buy_cook;

/**
 * Created by MARVIN on 27.04.2017.
 */

public class Ingredient {
    private final String name;
    private final Measurement measurement;

    public Ingredient(String name, Measurement measurement) {
        this.name = name;
        this.measurement = measurement;
    }

    public String getName() {
        return name;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

}
