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
            FileWriter fw = new FileWriter(filename, true);  // Tạo đối tượng FileWriter để mở file và ghi dữ liệu (append mode)
            BufferedWriter bw = new BufferedWriter(fw);  // Tạo đối tượng BufferedWriter để ghi dữ liệu vào file
            for (String book : booklist) {  // Duyệt qua từng sách trong danh sách
                bw.write(book);  // Ghi thông tin sách vào file
            }
            bw.close();  // Đóng BufferedWriter
            fw.close();  // Đóng FileWriter
        } catch (IOException e) {  // Xử lý các lỗi vào/ra
            System.out.println("Đã có lỗi xảy ra!");  // Hiển thị thông báo lỗi
            e.printStackTrace();  // In thông tin chi tiết lỗi
        }
    }
}