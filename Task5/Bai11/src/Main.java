import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{ // Khối try để thực hiện mã và xử lý lỗi
            System.out.print("Nhập vào số nguyên: ");
            int sn = sc.nextInt();
            System.out.print("Số nguyên của bạn là" + sn);
        } catch (InputMismatchException e){ // Khối catch để xử lý lỗi nếu người dùng nhập sai kiểu dữ liệu
            System.out.println("Bạn nhập sai định dạng số!");
            System.out.println("Lỗi chi tiết !" + e);
        }
    }
}