import java.util.Scanner;

public class Circle extends Shape {
    private double radius;
    public Circle(String ten, double bankinh){
        super(ten);
        this.radius = bankinh;
    }
    @Override
    double caculateAre() {
        return Math.PI * radius * radius;
    }
    public Circle(){

    }
    public void inShape(Scanner sc){
        super.inShape(sc);
        System.out.print("Bán kính: ");
        this.radius = sc.nextDouble();
        sc.nextLine();
    }

    public void outShape(){
        super.outShape();
        System.out.println("Bán kính: " + radius);
        System.out.println("Diện tích hình tròn: " + caculateAre());
    }
}
