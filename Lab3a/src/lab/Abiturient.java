package lab;
import java.util.Scanner;
import java.io.*;

public class Abiturient {
    private String id;
    private String name;
    private String address;
    private String phone;
    private int[] ozenki = new int[3];

    public Abiturient(String id, String name, String address, String phone, String hm) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        Scanner readString = new Scanner(hm);
        for (int g = 0; readString.hasNextInt(); g++) {
            ozenki[g] = readString.nextInt();
        }
        this.ozenki = ozenki;
    }

    public String toString() {
        return "\n" + "id: " + id + "\n"
                + "Имя: " + name + "\n"
                + "Адрес: " + address + "\n"
                + "Телефон: " + phone + "\n"
                + "Оценки: " + ozenki[0] + " , " + ozenki[1] + " , " + ozenki[2];
    }

    public void badBall(int g) {
        for (int i = 0; i < 3; i++) {
            if (this.ozenki[i] < g) {
                System.out.println(this);
                break;
            }
        }
    }

    public void amountOfBall(int g) {
        if (this.sumBall() > g) {
            System.out.println(this);
        }
    }

    public int postupili(int m) {
        if (this.sumBall() == m) {
            System.out.println(this);
            return(1);
        }
        return(0);
    }

    public int sumBall(){
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum = sum + this.ozenki[i];
        }
        return sum;
    }
}
