package point2D_point3D;

public class Point2D {
    private float X;
    private float Y;

    public Point2D(float x, float y) {
        this.X = x;
        this.Y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        this.X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        this.Y = y;
    }
    public float[] getXY(){
        float[] array={this.X,this.Y};
        return array;
    }
    public void setXY(float x,float y){
        this.X =x;
        this.Y =y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + X +
                ", y=" + Y +
                '}';
    }
}
