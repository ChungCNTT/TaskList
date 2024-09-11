import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        double h = sc.nextDouble();
        System.out.print("Nhập cân nặng: ");
        double w = sc.nextDouble();
        double bmi = w / (h*h);
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n",bmi);
        if(bmi < 18.5){
            System.out.println("Bạn quá gầy");
        }else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Bạn bình thường");
        }else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("Bạn thừa cân");
        }else{
            System.out.println("Bạn béo phì");
        }
    }
}