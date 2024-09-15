import java.util.Scanner;

public abstract class Shape {
    protected String name;
    public Shape(){

    }
    public Shape(String ten){
        this.name = ten;
    }
    // Phương thức nhập tên hình từ bàn phím
    public void inShape(Scanner sc){
        System.out.print("Nhập tên hình: ");
        this.name = sc.nextLine();
    }
    // Phương thức trừu tượng tính diện tích, cần được các lớp kế thừa triển khai
    abstract double caculateAre();
    // Phương thức xuất thông tin hình ra màn hình
    public void outShape(){
        System.out.println("Tên: " + name);
    }
}
