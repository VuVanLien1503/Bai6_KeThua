package BT_Shape_Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape("red");
        System.out.println("Shape1 : "+shape);
        Triangle triangle=new Triangle(3,3,3);
        System.out.println(triangle);
        System.out.println("Shape2 : "+shape);
    }
}
