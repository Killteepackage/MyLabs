package p.lab;
import p.lab.Polynom;
import java.util.*;

public class Polynom {
    private int[] coeff;
    private int step;

    public Polynom(int n) {
        step = n;
        coeff = new int[step + 1];
        for (int i = 0; i < step + 1; i++)
            coeff[i] = 0;
    }

    //Нулевой коэффициент - свободный член
    public void inputCoeff() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты: ");
        for(int i = 0; i < step + 1; i++) {
            System.out.print("coeff[" + i + "] = ");
            coeff[i] = in.nextInt();
            System.out.println();
        }
    }
    public void setCoeff(int index, int x) {
        coeff[index] = x;
    }
    public int getCoeff(int index) {
        return coeff[index];
    }
    public int getStep() {
        return step;
    }

    //Сумма полиномов
    public static Polynom summ(Polynom p1, Polynom p2) {
        int tempStep = 0;
        if(p1.getStep() < p2.getStep()) {
            tempStep = p1.getStep();
        }
        else {
            tempStep = p2.getStep();
        }
        Polynom tempP = new Polynom(tempStep);
        for(int i = 0; i < tempStep + 1; i++) {
            tempP.setCoeff(i, p1.getCoeff(i) + p2.getCoeff(i));
        }
        tempP.output();
        return tempP;
    }

    //Разность полиномов
    public static Polynom razn(Polynom p1, Polynom p2) {
        int tempStep = 0;
        if(p1.getStep() < p2.getStep()) {
            tempStep = p1.getStep();
        }
        else {
            tempStep = p2.getStep();
        }
        Polynom tempP = new Polynom(tempStep);
        for(int i = 0; i < tempStep + 1; i++) {
            tempP.setCoeff(i, p1.getCoeff(i) - p2.getCoeff(i));
        }
        tempP.output();
        return tempP;
    }

    //Произведение полиномов
    public static Polynom mult(Polynom p1, Polynom p2) {
        int tempStep = p1.getStep() + p2.getStep();
        Polynom tempP = new Polynom(tempStep);
        for(int i = 0; i < p1.getStep() + 1; i++) {
            for (int j = 0; j < p2.getStep() + 1; j++) {
                tempP.setCoeff(i + j, tempP.getCoeff(i + j)
                        + p1.getCoeff(i) * p2.getCoeff(j));
            }
        }
        tempP.output();
        return tempP;
    }

    //Инициализация полиномов
    public static Polynom inputPolynom() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите степень полинома: ");
        int degP = in.nextInt();
        Polynom p = new Polynom(degP);
        p.inputCoeff();
        return p;
    }

    //Вывод полинома на экран
    public void output() {
        for(int i = 0; i < step + 1; i++) {
            System.out.printf("%d*X^%d", coeff[i], i);
            if(i < step) {
                System.out.print("+");
            }
        }
        System.out.println();
    }
}
