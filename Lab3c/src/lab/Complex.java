package p.lab;
import java.util.Scanner;

public class Complex {
    double a_real;
    double ib_imag;

    public Complex() {
        this.a_real = 0;
        this.ib_imag = 0;
    }

    public Complex(double re, double im) {
        this.a_real = re;
        this.ib_imag = im;
    }

    public double get_a_real() {
        return a_real;
    }

    public double get_ib_imag() {
        return ib_imag;
    }

    public void setA_real(double a_real) {
        this.a_real = a_real;
    }

    public void setIb_imag(double ib_imag) {
        this.ib_imag = ib_imag;
    }

    private double getModule() {
        return Math.sqrt(this.a_real * this.a_real + this.ib_imag * this.ib_imag);
    }

    public static Complex sum(Complex c1, Complex c2) {
        return new Complex(c1.get_a_real() + c2.get_a_real(),
                c1.get_ib_imag() + c2.get_ib_imag());
    }

    public static Complex razn(Complex c1, Complex c2) {
        return new Complex(c1.get_a_real() - c2.get_a_real(),
                c1.get_ib_imag() - c2.get_ib_imag());
    }

    public static Complex mult(Complex c1, Complex c2) {
        return new Complex(c1.get_a_real() * c2.get_a_real()
                - c1.get_ib_imag() * c2.get_ib_imag(),
                c1.get_a_real() * c2.get_ib_imag() + c1.get_ib_imag()
                        * c2.get_a_real());
    }

    public static Complex chast(Complex c1, Complex c2) {
        Complex temp = new Complex(c2.get_a_real(), (-1) * c2.get_a_real());
        temp = Complex.mult(c1, temp);
        double denominator = c2.get_a_real() * c2.get_a_real()
                + c2.get_ib_imag() * c2.get_ib_imag();
        return new Complex(temp.get_a_real() / denominator,
                temp.get_ib_imag() / denominator);
    }

    private double GetArg() {
        if (this.a_real > 0) {
            return Math.atan(ib_imag / a_real);
        }
        else {
            if (a_real < 0 && ib_imag > 0) {
                return Math.PI + Math.atan(ib_imag / a_real);
            }
            else {
                return -Math.PI + Math.atan(ib_imag / a_real);
            }
        }
    }

    public static Complex pow(Complex c, int power) {
        double factor = Math.pow(c.getModule(), power);
        return new Complex(factor * Math.cos(power * c.GetArg()),
                factor * Math.sin(power * c.GetArg()));
    }

    public static Complex[] sqrt(Complex c) {
        double a = c.getModule() / 2;
        Complex pos = new Complex(Math.sqrt(a + c.get_a_real() / 2),
                Math.signum(c.get_ib_imag()) * Math.sqrt(a - c.get_a_real() / 2));
        Complex neg = new Complex((-1) * pos.get_a_real(),
                (-1) * pos.get_ib_imag());
        Complex[] answer = {pos, neg};
        return answer;
    }
    public static Complex inputComplex() {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();
        Complex c = new Complex(a, b);
        c.outputComplex();
        return c;
    }
    public void outputComplex() {
        System.out.print(get_a_real()+" + i"+get_ib_imag());
    }

}
