package гл4б;

import java.io.Serializable;

public class Carrot extends RootVegetable  implements Serializable {
    protected static String rotten;
    public Carrot() {
        super("Морковь", 41);
    }

    public Carrot(double weight) {
        super("Морковь", 41, weight);
    }

    @Override
    public String toString() {
        return super.toString()+" "+ rotten;
    }
}
