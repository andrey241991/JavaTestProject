package figures;

import common.BaseFigure;

import static java.lang.Math.PI;

public class Circle extends BaseFigure {

    private int radius;
    private static final String CIRCLE_NAME ="Circle";

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        super(color, CIRCLE_NAME);
        this.radius = radius;
    }

    @Override
    public void showUniqueProperty() {
        System.out.println("Circle radius is " + radius + ".");
    }

    @Override
    protected double getArea() {
        double area = (radius * radius * PI);
        return (double) Math.round(area * 100) / 100;
    }

}
