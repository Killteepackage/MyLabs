package lab8c;

import java.util.Scanner;

public class Lab8c {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String theatreName;
        System.out.print("Введите название театра: ");
        theatreName = in.next();
        int kotoryChas;
        System.out.print("Введите текущее время (час): ");
        kotoryChas = in.nextInt();
        Theatre OperaBalet = new Theatre(theatreName, kotoryChas);
        System.out.print("Введите адрес театра: ");
        String adress = in.next();
        OperaBalet.setAdress(adress);
        System.out.print(OperaBalet.toString());
    }
}
