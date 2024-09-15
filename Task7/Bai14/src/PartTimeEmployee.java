import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hourWorked;
    public PartTimeEmployee(String ten, int tuoi, String vitri, double luonggio, int giolv) {
        super(ten, tuoi, vitri);
        this.hourlyRate = luonggio;
        this.hourWorked = giolv;
    }

    public PartTimeEmployee() {
        super();
    }
    // Phương thức tính lương của nhân viên bán thời gian
    @Override
    double caculateSalary() {
        return hourlyRate * hourWorked;
    }
    // Phương thức nhập thông tin của nhân viên từ bàn phím
    @Override
    public void inEmployee(Scanner sc) {
        super.inEmployee(sc);
        System.out.print("Nhập lương theo giờ: ");
        this.hourlyRate = sc.nextDouble();
        System.out.print("Nhập số giờ đã đi làm: ");
        this.hourWorked = sc.nextInt();
        sc.nextLine();
    }
    // Phương thức xuất thông tin của nhân viên ra màn hình
    @Override
    public void outEmployee() {
        super.outEmployee();
        System.out.println("Lương theo giờ: " + hourlyRate);
        System.out.println("Số giờ đã làm: " + hourWorked);
        System.out.println("Lương: " + caculateSalary());
    }
}
