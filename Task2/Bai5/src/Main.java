import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ 1: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ 2: ");
        int b = sc.nextInt();
        System.out.print("Nhập phép toán: ");
        char p = sc.next().charAt(0);
        // Sử dụng cấu trúc switch-case để thực hiện phép toán dựa trên giá trị của p
        switch(p){
            case '+':
                int tong = a + b;
                System.out.printf("Tổng = " + tong);
                break;
            case '-':
                int hieu = a - b;
                System.out.printf("Hiệu = " + hieu);
                break;
            case '*':
                int nhan = a * b;
                System.out.printf("Nhân = " + nhan);
                break;
            case '/':
                float chia = (float)a / b;
                System.out.printf("Chia = %.2f" , chia);
                break;
            case '%':
                float chiaLaydu = (float)a % b;
                System.out.printf("Chia Lấy Dư = %.2f" , chiaLaydu);
                break;
            default:
                System.out.println("Sai rồi");
                break;
        }

    }
}