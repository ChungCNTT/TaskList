import java.util.Scanner;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(String ten, int tuoi, String vitri, double luong) {
        super(ten, tuoi, vitri);
        this.monthlySalary = luong;
    }
    public FullTimeEmployee(){
        super();
    }
    @Override
    double caculateSalary() {
        return monthlySalary;
    }

    @Override
    public void inEmployee(Scanner sc) {
        super.inEmployee(sc);
        System.out.print("Nhập lương hàng tháng: ");
        this.monthlySalary = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void outEmployee() {
        super.outEmployee();
        System.out.println("Lương hàng tháng: " + caculateSalary());
    }
}
