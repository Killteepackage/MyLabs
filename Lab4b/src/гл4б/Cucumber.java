package гл4б;

import java.io.Serializable;

public class Cucumber extends CucurbitaceaeVegetable implements Serializable {
    public Cucumber() {
        super("Огрурец", 16);
    }

    public Cucumber(double weight) {
        super("Огурец", 16, weight);
    }
}
