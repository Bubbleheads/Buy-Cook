package bubbleheads.buy_cook;

public class Ingredient {
    private final String name;
    private final Measurement measurement;

    public Ingredient(String name, Measurement measurement) {
        this.name = name;
        this.measurement = measurement;
    }

    public String getName() {return name;}
    public Measurement getMeasurement() {return measurement;}
}
