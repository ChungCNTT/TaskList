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
        for(int i = 2; i <= n/2; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }else{
                isPrime = true;
            }
        }
       if(isPrime == true){
           System.out.println(n + " là số nguyên tố");
       }else{
           System.out.println("Không là số nguyên tố");
       }
    }
}