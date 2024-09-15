import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ: ");
        double temparature  = sc.nextDouble();
        System.out.print("Nhập đơn vị cần chuyển đổi: ");
        // Đọc ký tự đơn vị từ bàn phím, chuyển đổi thành chữ in hoa và lấy ký tự đầu tiên
        char unit = sc.next().toUpperCase().charAt(0);
        if(unit == 'C'){
            // Chuyển đổi từ Celsius sang Fahrenheit theo công thức F = C * 9/5 + 32
            double convert = temparature * 9/5 + 32;
            System.out.printf("Từ Celsius sang Fahrenheit: %.2f ", convert);
        }else if (unit == 'F'){
            // Chuyển đổi từ Fahrenheit sang Celsius theo công thức C = (F - 32) * 5/9
            double convert = (temparature-32)*5/9;
            System.out.printf("Từ Fahrenheit sang Celsius: %.2f ", convert);
        }else{
            System.out.println("Không đúng rồi!");
        }
    }
}