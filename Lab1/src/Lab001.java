import java.util.Scanner;
public class Lab001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел вы введете?");
        int n = in.nextInt();
        System.out.println("Эти числа: ");
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Из них делятся и на 5, и на 7: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 5 == 0 && a[i] % 7 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
