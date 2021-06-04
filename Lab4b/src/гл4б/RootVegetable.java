package гл4б;

import java.io.Serializable;

public class RootVegetable extends Vegetable  implements Serializable {


    public RootVegetable(String name, double calories) {
        super(name, calories);
        setCategory("Корнеплоды");
    }

    public RootVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setCategory("Корнеплоды");
    }
}
