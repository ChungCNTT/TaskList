import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        List<String> TVList = new ArrayList<>();
        System.out.println("Xin mời nhập lựa chọn");
        while (true){
            System.out.println("\n 1.Thêm sách \n 2.Xóa sách \n 3.Sửa sách \n 4.In danh sách những quyển sách \n 5.Quit");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 5){
                break;
            }
            switch (choice){
                case 1:
                    System.out.print("Nhập tên sách cần thêm: ");
                    String namebook = sc.nextLine();
                    while (!namebook.isEmpty()){
                        System.out.print("Nhập tên sách cần thêm: ");
                        TVList.add(namebook);
                        namebook = sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.print("Nhập tên sách cần xóa: ");
                    String rvbook = sc.nextLine();
                    TVList.remove(rvbook);
                    break;
                case 3:
                    System.out.print("Nhập tên cuốn sách cần sửa: ");
                    String oldbook = sc.nextLine();
                    if(TVList.contains(oldbook)){
                        System.out.print("Nhập tên sách mới: ");
                        String newbook = sc.nextLine();
                        TVList.set(TVList.indexOf(oldbook), newbook);
                    }else{
                        System.out.print("Cuốn sách này không tồn tại");
                    }
                    break;
                case 4:
                    System.out.println("-----------THƯ VIỆN-----------");
                    for(String book: TVList){
                        System.out.println(book);
                    }
                    break;
            }
            System.out.print("-----END-----");
        }
    }
}