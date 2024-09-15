import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Vòng lặp ngoài để lặp qua các bảng cửu chương từ 1 đến 10
        for(int i = 1; i <= 10; i++){
            System.out.print("Bảng cửu chương " + i + ": ");
            // Vòng lặp trong để lặp qua các số từ 1 đến 10 trong mỗi bảng cửu chương
            for(int j = 1; j <=10; j++){
                System.out.print(" "+(i*j));
            }
            System.out.println();
        }
    }
}