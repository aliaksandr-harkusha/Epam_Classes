package test.EPAM_Task1.EntityClasses;

public class Surface {
    private Dot a;
    private Dot b;
    private Dot c;
    private double[] surfaceIndexSet = new double[3];

    public Surface(Dot a, Dot b, Dot c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.surfaceIndexSet[0] = (b.getY() - a.getY()) * (c.getZ() - a.getZ()) - (b.getZ() - a.getZ()) * (c.getY() - a.getY());
        this.surfaceIndexSet[1] = (b.getZ() - a.getZ()) * (c.getX() - a.getX()) - (b.getX() - a.getX()) * (c.getZ() - a.getZ());
        this.surfaceIndexSet[2] = (b.getX() - a.getX()) * (c.getY() - a.getY()) - (b.getY() - a.getY()) * (c.getX() - a.getX());
    }

    public void printIndexes() {
        System.out.println("Indexes: x: " + this.surfaceIndexSet[0] + ", y: " + this.surfaceIndexSet[1] + ", z: " + this.surfaceIndexSet[2]);
    }

    public double[] getSurfaceIndexSet() {
        return this.surfaceIndexSet;
    }

    public Dot getA() {
        return a;
    }

    public Dot getB() {
        return b;
    }

    public Dot getC() {
        return c;
    }

    public void setA(Dot a) {
        this.a = a;
    }

    public void setB(Dot b) {
        this.b = b;
    }

    public void setC(Dot c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Surface:\nFirst dot: " + getA().toString() + "\nSecond dot: " + getB().toString() + "\nThird dot: " + getC().toString();
    }

    public int hashCode(Surface s) {
        Integer newX = s.getA().hashCode(a);
        Integer newY = s.getB().hashCode(b);
        Integer newZ = s.getC().hashCode(c);
        return newX.hashCode() + newY.hashCode() + newZ.hashCode();
    }

    public boolean equals(Surface s) {
        return ((s.getA().equals(this.getA())) && (s.getB()).equals(this.getB()) && (s.getC()).equals(this.getC()));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
