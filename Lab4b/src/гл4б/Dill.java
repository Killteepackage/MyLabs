package гл4б;

import java.io.Serializable;

public class Dill extends SpicyVegetable implements Serializable {
    public Dill() {
        super("Укроп", 43);
    }


    public Dill(double weight) {
        super("Укроп", 43, weight);
    }
}
