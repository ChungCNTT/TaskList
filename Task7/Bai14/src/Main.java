import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FullTimeEmployee nvft = new FullTimeEmployee();
        System.out.println("Nhập thông tin nhân viên Full-time: ");
        nvft.inEmployee(sc);

        PartTimeEmployee nvpt = new PartTimeEmployee();
        System.out.println("\nNhập thông tin nhân viên Full-time: ");
        nvpt.inEmployee(sc);

        System.out.println("\nThông tin nhân viên Full-time: ");
        nvft.outEmployee();
        System.out.println("\nThông tin nhân viên Part-time: ");
        nvpt.outEmployee();
    }
}