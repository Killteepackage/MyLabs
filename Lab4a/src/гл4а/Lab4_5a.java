package гл4а;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4_5a {
    public static void main(String[] args) throws District.SquareLogicException {
        try {
        Scanner in = new Scanner(new File("input.txt"));
            Country country = new Country();
            String name = in.next();
            String capital = in.next();
            City capital0 = new City(capital);
            int numberr = in.nextInt();
            Region[] regions = new Region[numberr + 5];
            for(int i=0; i<numberr; i++) {
                String namei = in.next();
                int numberdi = in.nextInt();
                String capitali = in.next();
                City capitali0 = new City(capitali);
                District[] districts = new District[numberdi + 5];

                for(int j=0; j<numberdi; j++){
                    String nameij = in.next();
                    String capitalij = in.next();
                    City capitalij0 = new City(capitalij);
                    double squareij = in.nextDouble();
                    districts[j] = new District (nameij, capitalij0, squareij);
                }
                regions[i] = new Region(namei, capitali0, numberdi, districts);
            }
            country.setName(name);
            country.setCapital(capital0);
            country.setNumberr(numberr);
            country.setRegions(regions);
            country.getName();
           int choice = -1;
           int memory = 10;
           Scanner on = new Scanner(System.in);
           try{

           while (choice != 0) {
               System.out.print("\nОпции:\n");
               System.out.println("1) Показать столицу:");
               System.out.println("2) Показать областные центры:");
               System.out.println("3) Посчитать площадь:");
               System.out.println("4) Выход");
               int []mem = new int [memory];
               memory*=100;
             if(choice != 5)  choice = on.nextInt();
               switch(choice) {
                   case 1:
                       System.out.println(country.getCapital());
                       break;
                   case 2:
                       country.getRegionCenters();
                       break;

                   case 3:
                       System.out.println(country.CalculateSquare());
                       break;
                   case 4:
                       System.exit(0);
                       break;
                   default:
                       break;
               }
           }} catch (OutOfMemoryError e) {System.out.println("Недостаточно памяти");}
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл input.txt");
        } catch (District.SquareLogicException e) {
           System.out.println("Отрицательная площадь");
       }
    }
}
