import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Không thỏa mãn");
            return;
        }
        boolean isPrime = true;
        // Vòng lặp để kiểm tra tính nguyên tố của n từ 2 đến n/2
        for(int i = 2; i <= n/2; i++){
            // Nếu n chia hết cho i (n % i == 0), n không phải số nguyên tố
            if(n%i==0){
                isPrime = false;
                break;
            }else{
                isPrime = true; // Nếu không chia hết, isPrime vẫn giữ giá trị true
            }
        }
        // Kiểm tra giá trị của biến isPrime sau khi vòng lặp kết thúc
       if(isPrime == true){
           System.out.println(n + " là số nguyên tố");
       }else{
           System.out.println("Không là số nguyên tố");
       }
    }
}