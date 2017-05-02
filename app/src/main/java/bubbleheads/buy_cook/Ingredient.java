package bubbleheads.buy_cook;

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

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Ingredient
                && name.equalsIgnoreCase(((Ingredient) obj).getName())
                && measurement.equals(((Ingredient) obj).getMeasurement()));
    }
}
