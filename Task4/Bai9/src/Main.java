import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> qlkh = new HashMap<>();
        System.out.print("Vui lòng nhập lựa chọn của bạn");
        while (true){
            System.out.println("\n 1.Thêm khách hàng \n 2.Tìm khách hàng theo mã \n 3.In ra danh sách khách hàng \n 4.Quit");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 4){
                break;
            }
            switch (choice){
                case 1:
                    while (true){
                        System.out.print("Nhập mã khách hàng: ");
                        String makh = sc.nextLine();

                        if(makh.isEmpty()){
                            System.out.println("Đã dừng thêm khách hàng");
                            break;
                        }
                        if(qlkh.containsKey(makh)){
                            System.out.println("Mã khách hàng đã tồn tại");
                            continue;
                        }

                        System.out.print("Nhập tên khách hàng: ");
                        String tenkh = sc.nextLine();
                        qlkh.put(makh, tenkh);
                        System.out.println("Khách hàng đã được thêm. ");
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã khách hàng cần tìm kiếm: ");
                    String matk = sc.nextLine();
                    if(qlkh.containsKey(matk)){
                        System.out.println("Thông tin khách hàng: " + matk + ", Tên: " + qlkh.get(matk));
                    }else{
                        System.out.print("Khác hàng chưa tồn tại");
                    }
                    break;
                case 3:
                    if(qlkh.isEmpty()){
                        System.out.println("Danh sách khách hàng trống.");
                    }else{
                        System.out.println("--------------Danh sách khách hàng--------------");
                        for(String key: qlkh.keySet()){
                            System.out.println("Mã: "+ key + ", Tên: " + qlkh.get(key) + " ");
                        }
                        break;
                    }
                default:
                    System.out.println("Lựa chọn không hợp lệ. ");
                    break;
            }
            System.out.println("-------END------");
        }
    }
}