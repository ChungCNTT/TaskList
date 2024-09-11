import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin mời nhập kích thước mảng: ");
        int n = sc.nextInt();
        System.out.println("Xin mời nhập các phần tử cho mảng");
        int [] num = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Xin  mời nhập phần tử thứ " + i + ": ");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            for(int j = 0;j < n-i-1; j++){
                if(num[j]>num[j+1]){
                    int temp = num[j]; // temp = 5; num[0] = 5
                    num[j] = num[j+1]; // num[0] = 3
                    num[j+1] = temp;    // num[i] = 5
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(num[i]+" ");
        }

    }
}