package classCircle_Cylinder;

public class main {
    public static void main(String[] args) {
        Circle circle=new Circle(2.5,"red");
        Cylinder cylinder=new Cylinder(2.5,"green",5.5);
        System.out.println("AreaCircle="+circle.getArea());
        System.out.println("AreaCylinder="+cylinder.getArea());
        cylinder.getRadius();
        cylinder.getColor();

    }
}
