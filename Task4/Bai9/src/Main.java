import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, String> qlkh = new HashMap<>();

    public static void main(String[] args) {
        System.out.print("Vui lòng nhập lựa chọn của bạn");
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 4) {
                break;
            }
            handleChoice(choice);
        }
    }
    //Show ra thao tac
    private static void showMenu() {
        System.out.println("\n 1.Thêm khách hàng \n 2.Tìm khách hàng theo mã \n 3.In ra danh sách khách hàng \n 4.Quit");
    }
    //Xu ly thao tac
    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                addCustomer();
                break;
            case 2:
                findCustomer();
                break;
            case 3:
                printCustomerList();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. ");
                break;
        }
        System.out.println("-------END------");
    }
    //Them khach hang
    private static void addCustomer() {
        while (true) {
            System.out.print("Nhập mã khách hàng: ");
            String makh = sc.nextLine();

            if (makh.isEmpty()) {
                System.out.println("Đã dừng thêm khách hàng");
                break;
            }
            if (qlkh.containsKey(makh)) { // Nếu mã khách hàng đã tồn tại trong danh sách
                System.out.println("Mã khách hàng đã tồn tại");
                continue;
            }

            System.out.print("Nhập tên khách hàng: ");
            String tenkh = sc.nextLine();
            qlkh.put(makh, tenkh); // Thêm mã khách hàng và tên vào danh sách
            System.out.println("Khách hàng đã được thêm. ");
        }
    }
    //Tim kiem khach hang theo ma
    private static void findCustomer() {
        System.out.print("Nhập mã khách hàng cần tìm kiếm: ");
        String matk = sc.nextLine();
        if (qlkh.containsKey(matk)) { // Nếu danh sách chứa mã khách hàng
            System.out.println("Thông tin khách hàng: " + "Mã: "+ matk + ", Tên: " + qlkh.get(matk));
        } else {
            System.out.print("Khác hàng chưa tồn tại");
        }
    }
    //In ra danh sach khach hang
    private static void printCustomerList() {
        if (qlkh.isEmpty()) {
            System.out.println("Danh sách khách hàng trống.");
        } else {
            System.out.println("--------------Danh sách khách hàng--------------");
            for (String key : qlkh.keySet()) { // Duyệt qua tất cả các khóa trong HashMap
                System.out.println("Mã: " + key + ", Tên: " + qlkh.get(key) + " ");
            }
        }
    }
}
