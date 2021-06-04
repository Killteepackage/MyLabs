package гл4б;

import java.io.Serializable;

public class Tomato extends NightshadeVegetable  implements Serializable {
    public Tomato() {
        super("Помидор", 18);
    }



    public Tomato(double weight) {
        super("Помидор", 18, weight);
    }
}
