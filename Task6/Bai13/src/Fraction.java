import javax.swing.*;
import java.util.Scanner;

public class Fraction {
    private int Nmr;
    private int Dmn;

    public int getA() {
        return Nmr;
    }

    public int getB() {
        return Dmn;
    }

    public void setA(int a) {
        this.Nmr = a;
    }

    public void setB(int b) {
        this.Dmn = b;
    }

    public Fraction() {

    }

    public Fraction(int Numerator, int Denominator) {
        this.Nmr = Numerator;
        this.Dmn = Denominator;
    }

    public void inFraction(Scanner sc) {
        int a;
        int b;
        do {
            System.out.print("Nhập vào tử số: ");
            a = sc.nextInt();
            System.out.print("Nhập vào mẫu số: ");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("Mẫu số không được bằng 0.");
            } else {
                Nmr = a;
                Dmn = b;
            }
        } while (b == 0);
    }

    public void outFraction() {
        if (Nmr * Dmn < 0) {
            System.out.println("-" + Math.abs(Nmr) + "/" + Math.abs(Dmn));
        } else {
            System.out.println(Math.abs(Nmr) + "/" + Math.abs(Dmn));
        }
    }

    public Fraction add(Fraction frc2) {
        int a = Nmr * frc2.Dmn + frc2.Nmr * Dmn;
        int b = Dmn * frc2.Dmn;
        Fraction result = new Fraction(a,b);
        result.Simplify();
        return result;
    }

    public Fraction substract(Fraction frc2) {
        int a = Nmr * frc2.Dmn - frc2.Nmr * Dmn;
        int b = Dmn * frc2.Dmn;
        Fraction result = new Fraction(a,b);
        result.Simplify();
        return result;
    }

    public Fraction multiply(Fraction frc2) {
        int a = Nmr * frc2.Nmr;
        int b = Dmn * frc2.Dmn;
        Fraction result = new Fraction(a,b);
        result.Simplify();
        return result;
    }

    public Fraction divide(Fraction frc2) {
        int a = Nmr * frc2.Dmn;
        int b = Dmn * frc2.Nmr;
        Fraction result = new Fraction(a,b);
        result.Simplify();
        return result;
    }

    public int GCD(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public boolean checkSimplify() {
        if(GCD(Nmr,Dmn) == 1){
            return true;
        }
        return false;
    }
    public void Simplify(){
        int simp = GCD(Nmr,Dmn);
        Nmr /= simp;
        Dmn /= simp;
    }
}
