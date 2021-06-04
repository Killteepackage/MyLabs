package гл4б;

import java.io.IOException;
import java.io.Serializable;

public class Lab4b implements Serializable {
    public static void main(String[] args) throws IOException, InterruptedException {
        Chef chef = new Chef();
        chef.showOptions();
    }
}
