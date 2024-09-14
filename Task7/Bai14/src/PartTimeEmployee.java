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

    @Override
    double caculateSalary() {
        return hourlyRate * hourWorked;
    }

    @Override
    public void inEmployee(Scanner sc) {
        super.inEmployee(sc);
        System.out.print("Nhập lương theo giờ: ");
        this.hourlyRate = sc.nextDouble();
        System.out.print("Nhập số giờ đã đi làm: ");
        this.hourWorked = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void outEmployee() {
        super.outEmployee();
        System.out.println("Lương theo giờ: " + hourlyRate);
        System.out.println("Số giờ đã làm: " + hourWorked);
        System.out.println("Lương: " + caculateSalary());
    }
}
