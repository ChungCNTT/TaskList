public class BankAccount {
    private String accountNumber;
    private double balance;
    public  BankAccount(){ // Constructor mặc định, khởi tạo đối tượng mà không cần tham số
    }
    public BankAccount(String account, double sodu){ // Constructor có tham số để khởi tạo đối tượng với số tài khoản và số dư
        this.accountNumber = account;
        this.balance = sodu;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBlance() {
        return balance;
    }
    public void setAccountNumber(String account){
        this.accountNumber = account;
    }
    public void setBlance(double sodu){
        this.balance = sodu;
    }
    public void deposit(double amount){ // Phương thức gửi tiền vào tài khoản
        if(amount > 0){
            balance += amount;
            System.out.println("Gửi tiền thành công. Số dư tài khoản: " + balance);
        }else{
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }
    public void withdraw(double amount){ // Phương thức rút tiền từ tài khoản
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Rút tiền thành công. Số dư tài khoản: " + balance);
        } else if (amount > balance) {
            System.out.println("Số dư không đủ để thực hiện giao dịch.");
        }else{
            System.out.println("Số tiền rút phải lớn hơn 0.");
        }
    }
}

