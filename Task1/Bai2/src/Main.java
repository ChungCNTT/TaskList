import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ: ");
        double temparature  = sc.nextDouble();
        System.out.print("Nhập đơn vị cần chuyển đổi: ");
        char unit = sc.next().toUpperCase().charAt(0);
        if(unit == 'C'){
            double convert = temparature * 9/5 + 32;
            System.out.printf("Từ Celsius sang Fahrenheit: %.2f ", convert);
        }else if (unit == 'F'){
            double convert = (temparature-32)*5/9;
            System.out.printf("Từ Fahrenheit sang Celsius: %.2f ", convert);
        }else{
            System.out.println("Không đúng rồi!");
        }
    }
}