import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.print("Bảng cửu chương " + i + ": ");
            for(int j = 1; j <=10; j++){
                System.out.print(" "+(i*j));
            }
            System.out.println();

        }
    }
}