package BT_Shape_Triangle;

public class Triangle extends Shape {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Triangle(String color, double edgeA, double edgeB, double edgeC) {
        super(color);
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        setColor("yellow");
    }

    public Triangle() {
        this.edgeA = 1.0;
        this.edgeB = 1.0;
        this.edgeC = 1.0;
        setColor("yellow");
    }

    public double getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(double edgeB) {
        this.edgeB = edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }
    public double getPerimeter(){
        return this.edgeA+this.edgeB+this.edgeC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + getColor() + '\'' +
                "edgeA=" + edgeA +
                ", edgeB=" + edgeB +
                ", edgeC=" + edgeC +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
