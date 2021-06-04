package lab8a;
import java.util.Scanner;

public class Lab8a {
    public static void main(String[] args) {
        BooleanInterface r = number -> number % 13 == 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        boolean var = r.calculate(n);
        System.out.println(var);
    }
}
