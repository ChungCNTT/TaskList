import java.util.Scanner;
// Lớp Employee là lớp trừu tượng cơ sở cho các loại nhân viên
public abstract class Employee {
    protected String name;
    protected int age;
    protected String position;

    public Employee(String ten, int tuoi, String vitri){
        this.name = ten;
        this.age = tuoi;
        this.position = vitri;
    }
    public Employee(){

    }
    // Phương thức nhập thông tin nhân viên từ bàn phím
    public void inEmployee(Scanner sc){
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập vị trí: ");
        this.position = sc.nextLine();
    }
    // Phương thức xuất thông tin nhân viên ra màn hình
    public void outEmployee() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Vị trí: " + position);
    }
    // Phương thức trừu tượng tính lương của nhân viên (cần được cài đặt trong các lớp con)
    abstract double caculateSalary();
}
