package гл4б;

import java.io.Serializable;

public class Potato extends NightshadeVegetable implements Serializable {
    public Potato() {
        super("Картофель", 77);
    }


    public Potato(double weight) {
        super("Картофель", 77, weight);
    }
}
