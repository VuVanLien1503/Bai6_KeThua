package point2D_point3D;

public class Point3D extends Point2D{
    private float Z;

    public Point3D() {
    }

    public Point3D(float z) {
        this.Z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.Z = z;
    }

    public float getZ() {
        return Z;
    }

    public void setZ(float z) {
        Z = z;
    }
    public float[] getXYZ(){
        float[] array=new float[]{this.getX(),this.getY(),this.Z};
        return array;
    }
    public void setXYZ(float x,float y,float z){
        this.Z=z;
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                "Z=" + Z +
                '}';
    }
}
