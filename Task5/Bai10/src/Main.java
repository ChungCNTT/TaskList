import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<String> booklist = new ArrayList<>();
            String filename = "book.txt";
            while(true){
                    System.out.println("Nhập thông tin sách: ");
                    System.out.print("Tên sách: ");
                    String namebook = sc.nextLine();
                    System.out.print("Tên tác giả: ");
                    String author = sc.nextLine();
                    System.out.print("Năm sản xuất: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    booklist.add(namebook + " - " + author + " - " + year + "\n");
                    System.out.print("Bạn có muốn nhập tiếp không (y/n)");
                    String choice = sc.nextLine();
                    if(choice.equalsIgnoreCase("n")){
                        break;
                    }
            }
            try {
                FileWriter fw = new FileWriter(filename, true);
                BufferedWriter bw = new BufferedWriter(fw);
                for (String book : booklist) {
                    bw.write(book + "\n");
                }
                bw.close();
                fw.close();
            } catch (Exception e) {
                System.out.println("Đã có lỗi xảy ra!");
                e.printStackTrace();
            }
    }
}