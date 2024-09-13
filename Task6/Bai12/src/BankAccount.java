public class BankAccount {
    private String accountNumber;
    private double balance;
    public  BankAccount(){
    }
    public BankAccount(String account, double sodu){
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
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Gửi tiền thành công. Số dư tài khoản: " + balance);
        }else{
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }
    public void withdraw(double amount){
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

