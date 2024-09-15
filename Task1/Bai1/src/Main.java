import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu đầu vào
        Scanner sc = new Scanner(System.in);
        // In ra yêu cầu nhập chiều cao từ người dùng
        System.out.print("Nhập chiều cao: ");
        double h = sc.nextDouble();
        System.out.print("Nhập cân nặng: ");
        double w = sc.nextDouble();
        // Tính chỉ số BMI dựa trên công thức BMI = cân nặng / (chiều cao * chiều cao)
        double bmi = w / (h*h);
        // In ra chỉ số BMI đã tính với định dạng 2 chữ số sau dấu phẩy
        System.out.printf("Chỉ số BMI của bạn là: %.2f\n",bmi);
        // Kiểm tra chỉ số BMI và in ra kết quả đánh giá
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