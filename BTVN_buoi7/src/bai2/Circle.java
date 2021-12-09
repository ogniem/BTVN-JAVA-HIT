package bai2;

public class Circle implements IShape{
    private double radius;

    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*3.14 ;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*this.radius ;
    }
}
