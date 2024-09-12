import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        private static Scanner sc = new Scanner(System.in);
        private  static List<String> TVList = new ArrayList<>();
        public static void main(String[] args) {
        System.out.println("Xin mời nhập lựa chọn");
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 5) {
                break;
            }
            handleChoice(choice);
        }
    }
        //Xu ly cac thao tac
        private static void handleChoice(int choice){
        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                removeBook();
                break;
            case 3:
                updateBook();
                break;
            case 4:
                printBook();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
        System.out.print("-----END-----");
    }
        //Chi ra cac thao tac
        private static void showMenu(){
            System.out.println("\n 1.Thêm sách \n 2.Xóa sách \n 3.Sửa sách \n 4.In danh sách những quyển sách \n 5.Quit");
        }
        //Them sach
        private static void addBook(){
            System.out.print("Nhập tên sách cần thêm: ");
            String namebook = sc.nextLine();
            while (!namebook.isEmpty()){
                System.out.print("Nhập tên sách cần thêm: ");
                TVList.add(namebook);
                namebook = sc.nextLine();
            }
        }
        //Xoa sach
        private static void removeBook(){
            System.out.print("Nhập tên sách cần xóa: ");
            String rvbook = sc.nextLine();
            if(TVList.remove(rvbook)){
                System.out.println("Cuốn sách đã được xóa.");
            }else{
                System.out.println("Cuốn sách không tồn tại.");
            }
        }
        //Sua sach
        private static void updateBook(){
            System.out.print("Nhập tên cuốn sách cần sửa: ");
            String oldbook = sc.nextLine();
            if(TVList.contains(oldbook)){
                System.out.print("Nhập tên sách mới: ");
                String newbook = sc.nextLine();
                TVList.set(TVList.indexOf(oldbook), newbook);
            }else{
                System.out.print("Cuốn sách này không tồn tại");
            }
        }
        //In sach
        private static void printBook(){
            System.out.println("-----------THƯ VIỆN-----------");
            for (String book : TVList) {
                System.out.println(book);
            }
        }
}