import lab.Abiturient;

import java.io.*;
import java.util.Scanner;

public class Lab3a {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        File file = new File("C:\\прога\\лабыыы\\Lab3a\\data\\list3a.txt");
        Scanner read = new Scanner(file);
        int n = 15;
        Abiturient[] spis = new Abiturient[n];
        String name;
        String id;
        String addres;
        String phone;
        String ozenkiString = "";
        Scanner readString = new Scanner(ozenkiString);
        int[] ozenkiInt = new int[3];
        for(int i = 0; i < n && read.hasNextLine(); i++){
            name = read.nextLine();
            id = read.nextLine();
            addres = read.nextLine();
            phone = read.nextLine();
            ozenkiString = read.nextLine();
            for(int g = 0; readString.hasNextInt(); g++)
                ozenkiInt[g] = readString.nextInt();
            spis[i] = new Abiturient(id, name, addres, phone, ozenkiString);
        }
        readString.close();
        read.close();
        boolean b = true;
        while(b) {
            switch(menu()){
                case 1: {
                    for (int i = 0; i < n; i++)
                        System.out.println(spis[i]);
                    break;
                }
                case 2: {
                    System.out.println("Введите неудовлетворительную оценку: ");
                    int g = in.nextInt();
                    for (int i = 0; i < n; i++)
                        spis[i].badBall(g);
                    break;
                }
                case 3: {
                    System.out.println("Введите сумму баллов: ");
                    int g = in.nextInt();
                    for (int i = 0; i < n; i++)
                        spis[i].amountOfBall(g);
                    break;
                }
                case 4: {
                    System.out.println("Введите кол-во мест: ");
                    int s = in.nextInt();
                    for(int m = 30; m > 0 && s > 0; m--)
                        for(int i = 0; i < n && s > 0; i++)
                            s = s - spis[i].postupili(m);
                    break;
                }
                case 5: {
                    b = false;
                    break;
                }
            }
        }
    }

    public static int menu(){
        Scanner in = new Scanner(System.in);
        String[] menu = new String[] {"Меню: ", "1. Список абитуриентов",
                "2. Список абитуриентов, имеющих неудовлетворительные оценки",
                "3. Список абитуриентов, у которых сумма баллов выше заданной",
                "4. Выбрать n абитуриентов, имеющих самую высокую сумму баллов",
                "5. Выход"};
        for(int i = 0; i < 6; i++)
            System.out.println(menu[i]);
        int ch = in.nextInt();
        return ch;
    }

    public static void sortMass(int[] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m.length - 1; j++) {
                if (m[j] < m[j + 1]) {
                    int r = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = r;
                }
            }
        }
    }
}
