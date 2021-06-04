package p.lab;
import java.util.Scanner;

public class Fract{
    Complex num;
    Complex den;

    public Complex get_num() { return num; }
    public Complex get_den() { return den; }

    public void setNum(Complex num) {
        this.num = num;
    }

    public void setDen(Complex den) {
        this.den = den;
    }

    public static Fract Plus(Fract r1, Fract r2) {
        Fract result = new Fract();
        result.den = Complex.mult(r1.get_den(), r2.get_den());
        result.num = Complex.sum(Complex.mult(r1.get_num(), r2.get_num()),
                Complex.mult(r2.get_num(), r1.get_den()));
        return result;
    }

    public static Fract Minus(Fract r1, Fract r2) {
        Fract result = new Fract();
        result.den = Complex.mult(r1.get_den(), r2.get_den());
        result.num = Complex.razn(Complex.mult(r1.get_num(), r2.get_den()),
                Complex.mult(r2.get_num(), r1.get_den()));
        return result;
    }

    public static Fract Umnoz(Fract r1, Fract r2) {
        Fract result = new Fract();
        result.den = Complex.mult(r1.get_den(), r2.get_den());
        result.num = Complex.mult(r1.get_num(), r2.get_num());
        return result;
    }

    public static Fract Delen(Fract r1, Fract r2) {
        Fract result = new Fract();
        result.den = Complex.mult(r1.get_den(), r2.get_num());
        result.num = Complex.mult(r1.get_num(), r2.get_den());
        return result;
    }

    public static Fract inputFract(Fract f) {
        //Fract f = new Fract();
        Scanner in = new Scanner(System.in);
        System.out.println("Числитель: ");
        f.get_num().inputComplex();
        System.out.println();
        System.out.println("Знаменатель: ");
        f.get_den().inputComplex();
        System.out.println();
        return f;
    }

    public void outputFract() {
        get_num().outputComplex();
        System.out.println("/");
        get_den().outputComplex();
    }
}
