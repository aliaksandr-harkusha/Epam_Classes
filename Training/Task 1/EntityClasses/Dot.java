package test.EPAM_Task1.EntityClasses;

public class Dot {
    private double x;
    private double y;
    private double z;

    public Dot(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y + ", z= " + z;
    }

    public boolean equals(Dot d) {
        Double x1 = new Double(d.getX());
        Double x2 = new Double(this.getX());
        Double y1 = new Double(d.getY());
        Double y2 = new Double(this.getY());
        Double z1 = new Double(d.getZ());
        Double z2 = new Double(this.getZ());
        return ((x1.equals(x2)) && (y1.equals(y2)) && (z1.equals(z2)));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode(Dot d) {
        Integer newX = (int) d.getX();
        Integer newY = (int) d.getY();
        Integer newZ = (int) d.getZ();
        return newX.hashCode() + newY.hashCode() + newZ.hashCode();
    }
}
