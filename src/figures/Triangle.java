package figures;

import common.BaseFigure;

public class Triangle extends BaseFigure {

    private int width;
    private int height;
    private static final String TRIANGLE_NAME ="Triangle";

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Triangle(int width, int height,String color) {
        super(color, TRIANGLE_NAME);
        this.width = width;
        this.height = height;
    }

    @Override
    public void showUniqueProperty() {
        double hypo = Math.hypot(width, height);
        System.out.format("The hypotenuse of a triangle = %.2f \n", hypo);
    }

    @Override
    protected double getArea() {
        double area = (width * height) / 2;
        return (double) Math.round(area * 100) / 100;
    }

}
