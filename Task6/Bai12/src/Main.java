import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tài khoản: ");
        String accountNumber = sc.nextLine();
        System.out.print("Nhập số dư ban đầu: ");
        double initialBalance = sc.nextDouble();
        BankAccount account =  new BankAccount(accountNumber, initialBalance);
        while (true){
            System.out.print("Vui lòng nhập lựa chọn.");
            System.out.println("\n 1.Gửi tiền \n 2.Rút tiền \n 3. Kiểm tra số dư \n 4.Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 4){
                break;
            }
            switch (choice){
                case 1:
                    System.out.print("Nhập số tiền gửi: ");
                    double depositAccount = sc.nextDouble();
                    account.deposit(depositAccount);
                    break;
                case 2:
                    System.out.print("Nhập số tiền rút: ");
                    double withdrawAccount = sc.nextDouble();
                    account.withdraw(withdrawAccount);
                    break;
                case 3:
                    System.out.println("Số dư tài khoản là: " + account.getBlance());
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println("---------------End---------------");
        }


    }
}