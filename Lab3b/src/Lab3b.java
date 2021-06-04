import p.lab.Polynom;

import java.util.Scanner;

public class Lab3b {
    public static void main(String[] args) {
        int ch = 0;
        Polynom p1 = null, p2 = null, pResult = null;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Ввод");
            System.out.println("2. Вывести полиномы");
            System.out.println("3. Получить сумму");
            System.out.println("4. Получить разность ");
            System.out.println("5. Получить произведение");
            System.out.println("6. Выход");
            System.out.print("Введите номер пункта: ");
            ch = in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Полином p1:");
                    p1 = p1.inputPolynom();
                    System.out.println("Полином p2:");
                    p2 = p2.inputPolynom();
                    break;
                case 2:
                    System.out.println("Полином p1: ");
                    p1.output();
                    System.out.println("Полином p2: ");
                    p2.output();
                    break;
                case 3:
                    pResult = pResult.summ(p1, p2);
                    break;
                case 4:
                    pResult = pResult.razn(p1, p2);
                    break;
                case 5:
                    pResult = pResult.mult(p1, p2);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }while(true);
    }
}