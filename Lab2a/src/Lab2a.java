import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

/* 4. Найти число, в котором число различных цифр минимально.
Если таких чисел несколько, найти первое из них. */

public class Lab2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел хотите сравнить?: ");
        int n = in.nextInt();
        System.out.println("Эти числа: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt(); // заполняем массив случайными числами
        }
        minimus(a);

        System.out.println("Выполнила Грицель Вероника Эдуардовна");
        System.out.println("Дата и время получения задания: ");
        System.out.println("Mon Feb 10 13:00:00 MSK 2021");
        System.out.println("Дата и время сдачи задания:");
        Date date = new Date();
        System.out.println(date);
    }

    private static void minimus(int[] arr) { // функция поиска минимального элемента
        int min = diffNum(arr[0]); /* элементу min присваивается значение длины
        числа arr[0]*/
        int minElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (diffNum(arr[i]) < min) {
                min = diffNum(arr[i]);
                minElem = arr[i];
            }
        }
        System.out.println("Минимальное различие чисел: " + minElem + "\n");
    }

    private static int diffNum(int x) { // функция преобразования числа в массив
        HashSet<Integer> nums = new HashSet<>(); /* удобнее использовать, чем массив,
        т. к. для хранения данных использует хеш-таблицы. Хеш-таблица представляет
        такую структуру данных, в которой все объекты имеют уникальный ключ или хеш-код.
        Данный ключ позволяет уникально идентифицировать объект в таблице */
        while (x > 0) {
            nums.add(x % 10); /* если такой элемент уже присутствует,
            он не добавляется */
            x /= 10;
        }
        return nums.size();
    }
}
