import java.util.Scanner;

public class Circle extends Shape {
    private double radius;
    public Circle(String ten, double bankinh){
        super(ten);
        this.radius = bankinh;
    }
    // Phương thức tính diện tích hình tròn
    @Override
    double caculateAre() {
        return Math.PI * radius * radius;
    }
    public Circle(){

    }
    // Phương thức nhập thông tin hình tròn từ bàn phím
    public void inShape(Scanner sc){
        super.inShape(sc);
        System.out.print("Bán kính: ");
        this.radius = sc.nextDouble();
        sc.nextLine();
    }
    // Phương thức xuất thông tin hình tròn ra màn hình
    public void outShape(){
        super.outShape();
        System.out.println("Bán kính: " + radius);
        System.out.println("Diện tích hình tròn: " + caculateAre());
    }
}
