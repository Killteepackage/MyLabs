package гл4б;

import java.io.*;
import java.util.Scanner;

public class Chef implements Serializable {

    public Salad salad;

    public Chef() {
        salad = new Salad();
    }

    public Chef( Salad salad) {
        this.salad = salad;
    }

    //Диапазон калорийности
    public void showIngredientsForCalories(Scanner scanner) {
        double lowerCalories, upperCalories;
        System.out.println("Введите нижний предел:");
            lowerCalories = scanner.nextDouble();
        System.out.println("Введите верхний предел:");
            upperCalories = scanner.nextDouble();
        salad.showIngredientsByCalories(lowerCalories, upperCalories);
    }

    public void showOptions() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        Vegetable vegetable = null;

        System.out.println("Что мы будем сегодня готовить?");

        while (choice != 0) {
            System.out.println("\nВыберите опцию:");
            System.out.println("1. Переименовать салат");
            System.out.println("2. Показать рецепт");
            System.out.println("3. Сортировать ингредиенты по калориям");
            System.out.println("4. Найти ингредиенты заданного диапазона калорийности");
            System.out.println("5. Синхронизированная запись рецепта в файл");
            System.out.println("0. Выход");

choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    try{ Scanner in = new Scanner(new File("input.txt")) ;
                        try{
                        salad.setname(in.next());} catch (Salad.NameLogicException e) {
                            System.out.println("Имя неверное");
                        }
                    } catch (FileNotFoundException e) {
                    System.out.println("Невозможно открыть файл input.txt");
                }
                    break;
                case 2:
                    salad.showRecipe();
                    break;
                case 3:
                    salad.sortIngredient_sByCalories();
                    break;
                case 4:
                    showIngredientsForCalories(scanner);
                    break;
                case 5:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Введите имя файла: ");
                    String filename = scanner1.next();
                    salad.writeRecipeIntoFile(filename);
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
