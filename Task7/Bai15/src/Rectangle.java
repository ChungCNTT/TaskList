import java.util.Scanner;

public class Rectangle extends Shape{
    private double width;
    private double hight;
    public Rectangle(){

    }
    public Rectangle(String ten, double chieurong, double chieucao){
        super(ten);
        this.width = chieurong;
        this.hight = chieucao;
    }
    // Phương thức tính diện tích hình chữ nhật
    @Override
    double caculateAre() {
        return width * hight;
    }
    // Phương thức nhập thông tin hình chữ nhật từ bàn phím
    @Override
    public void inShape(Scanner sc) {
        super.inShape(sc);
        System.out.print("Chiều rộng: ");
        this.width = sc.nextDouble();
        System.out.print("Chiều cao: ");
        this.hight = sc.nextDouble();
        sc.nextLine();
    }
    // Phương thức xuất thông tin hình chữ nhật ra màn hình
    @Override
    public void outShape() {
        super.outShape();
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều cao: " + hight);
        System.out.println("Diện tích tam giác: " + caculateAre());
    }
}
