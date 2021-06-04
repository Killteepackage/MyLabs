import java.util.Scanner;

/* 4. Найти сумму элементов матрицы, расположенных между
первым и последним положительными элементами каждой строки*/

public class Lab2c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int n = in.nextInt();
        System.out.println("Матрица: ");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * (2 * n + 1)) - n;
                //генерируем число от -n до n.
            }
        }
        for (int i = 0; i < n; i++) { //вывод матрицы
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n"); //переход на новую строчку
        }
        int indexStart = 0, indexEnd = 0, sum1str = 0, sum_ob = 0;
        for (int i = 0; i < n; i++) { // общий цикл на всю матрицу
            for (int j = 0; j < n; j++) { // первый + элемент в строке
                if (a[i][j] > 0) {
                    indexStart = j;
                    break;
                }
            }
            for (int j = n - 1; j >= indexStart; j--) { // последний + иэлемент в строке
                if (a[i][j] > 0) {
                    indexEnd = j;
                    break;
                }
            }
            for (int j = indexStart + 1; j < indexEnd; j++) { // сумма элементов
                sum1str += a[i][j];
                sum_ob += a[i][j];
            }
            System.out.println("Сумма элементов " + (i+1) + " строки: " + sum1str);
            // выведет 0, если индексы были равны
            sum1str = 0; //обнуление счётчика суммы по строкам
        }
        System.out.println("Сумма всех элементов: " + sum_ob); /* выведет 0,
        если индексы были равны */
    }
}

