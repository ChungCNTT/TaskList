import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhập vào số nguyên: ");
            int sn = sc.nextInt();
            System.out.print("Số nguyên của bạn là" + sn);
        } catch (InputMismatchException e){
            System.out.println("Bạn nhập sai định dạng số!");
            System.out.println("Lỗi chi tiết !" + e);
        }
    }
}