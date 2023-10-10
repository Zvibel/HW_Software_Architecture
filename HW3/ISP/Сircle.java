package HW.HW3.ISP;

public class Сircle implements iShape{
    private double radius;

    public Сircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
