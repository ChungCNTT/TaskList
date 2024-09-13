import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction frc1 = new Fraction();
        Fraction frc2 = new Fraction();

        System.out.println("Nhập vào phân số thứ 1: ");
        frc1.inFraction(sc);
        System.out.println("Nhập vào phân số thứ 2: ");
        frc2.inFraction(sc);
        System.out.print("Phân số thứ 1: ");
        frc1.outFraction();
        System.out.print("Phân số thứ 2: ");
        frc2.outFraction();
        while (true){
            System.out.print("Nhập vào phép toán cần dùng: ");
            String choice = sc.next();
            Fraction result;
            if(choice.equals("q")){
                System.out.println("Chương trình đã kết thúc.");
                break;
            }
            switch (choice) {
                case "+":
                    result = frc1.add(frc2);
                    System.out.print("Tổng 2 phân số là: ");
                    result.outFraction();
                    break;
                case "-":
                    result = frc1.substract(frc2);
                    System.out.print("Hiệu 2 phân số là: ");
                    result.outFraction();
                    break;
                case "*":
                    result = frc1.multiply(frc2);
                    System.out.print("Tích 2 phân số là: ");
                    result.outFraction();
                    break;
                case "/":
                    result = frc1.divide(frc2);
                    System.out.print("Thương 2 phân số là: ");
                    result.outFraction();
                    break;
                default:
                    System.out.println("Nhập sai phép toán vui lòng nhập lại!");
                    break;
            }
            System.out.println("-------------End-------------");
        }
    }
}