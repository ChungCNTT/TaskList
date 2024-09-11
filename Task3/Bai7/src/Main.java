import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.print("Vui lòng nhập kĩ tự: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println("Số lần kí tự "+ c + "xuất hiện là: " + count);
    }
}