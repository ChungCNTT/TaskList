import java.util.Scanner;

public abstract class Shape {
    protected String name;
    public Shape(){

    }
    public Shape(String ten){
        this.name = ten;
    }

    public void inShape(Scanner sc){
        System.out.print("Nhập tên hình: ");
        this.name = sc.nextLine();
    }
    abstract double caculateAre();

    public void outShape(){
        System.out.println("Tên: " + name);
    }
}
