import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle ht = new Circle();
        System.out.println("Nhập thông tin hình tròn: ");
        ht.inShape(sc);
        Rectangle tg = new Rectangle();
        System.out.println("--------------------------------------------");
        System.out.println("\nNhập thông tin tam giác: ");
        tg.inShape(sc);
        System.out.println("--------------------------------------------");
        System.out.println("\nThông tin hình tròn: ");
        ht.outShape();
        System.out.println("--------------------------------------------");
        System.out.println("\nThông tin hình tam giác: ");
        tg.outShape();
        System.out.println("--------------------------------------------");
    }
}