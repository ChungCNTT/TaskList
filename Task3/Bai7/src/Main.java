import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập chuỗi: ");
        String str = sc.nextLine(); // Đọc chuỗi từ người dùng và lưu vào biến str
        System.out.print("Vui lòng nhập kĩ tự: ");
        char c = sc.next().charAt(0); // Đọc ký tự từ người dùng và lưu vào biến c (chỉ lấy ký tự đầu tiên)
        int count = 0;
        // Vòng lặp để duyệt qua từng ký tự của chuỗi
        for(int i = 0; i < str.length(); i++){
            // Kiểm tra nếu ký tự tại vị trí i trong chuỗi trùng với ký tự c
            if(str.charAt(i) == c){
                count++; // Tăng giá trị biến count lên 1 nếu ký tự trùng khớp
            }
        }
        System.out.println("Số lần kí tự "+ c + "xuất hiện là: " + count);
    }
}