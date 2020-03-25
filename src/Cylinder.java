public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 *super.getArea() + 2 * Math.PI * height;
    }

    @Override
    public String toString() {
        return "height = " + getHeight()+", "+super.toString();
    }
}
