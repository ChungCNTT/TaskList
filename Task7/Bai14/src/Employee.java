import java.util.Scanner;

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
    public void inEmployee(Scanner sc){
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập vị trí: ");
        this.position = sc.nextLine();
    }

    public void outEmployee() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Vị trí: " + position);
    }
    abstract double caculateSalary();
}
