package гл4б;

import java.io.Serializable;

public class SpicyVegetable extends Vegetable implements Serializable {

    public SpicyVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Пряные овощи");
    }

    public SpicyVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Пряные овощи");
    }
}
