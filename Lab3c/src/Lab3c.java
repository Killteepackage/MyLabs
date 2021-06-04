import p.lab.Fract;
import java.util.*;

public class Lab3c {
    public static void main(String[] args) {
        int ch = 0;
        Fract f1 = null, f2 = null, fResult = null;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Ввод");
            System.out.println("2. Вывести дроби");
            System.out.println("3. Получить сумму");
            System.out.println("4. Получить разность ");
            System.out.println("5. Получить произведение");
            System.out.println("6. Получить частное");
            System.out.println("7. Выход");
            System.out.println("Введите номер пункта: ");
            ch = in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Дробь f1:");
                    f1 = f1.inputFract(f1);
                    System.out.println("Дробь f2:");
                    f2 = f2.inputFract(f2);
                    break;
                case 2:
                    System.out.println("Дробь f1: ");
                    f1.outputFract();
                    System.out.println("Дробь f2: ");
                    f2.outputFract();
                    break;
                case 3:
                    fResult = fResult.Plus(f1, f2);
                    break;
                case 4:
                    fResult = fResult.Minus(f1, f2);
                    break;
                case 5:
                    fResult = fResult.Umnoz(f1, f2);
                    break;
                case 6:
                    fResult = fResult.Delen(f1, f2);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }while(true);
    }
}
