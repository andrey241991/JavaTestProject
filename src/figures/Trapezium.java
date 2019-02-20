package figures;

import common.BaseFigure;

public class Trapezium extends BaseFigure {

    private double firstBase;
    private double secondBase;
    private double height;
    private static final String TRAPEZIUM_NAME ="Trapezium";

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Trapezium(double firstBase, double secondBase, double height, String color) {
        super(color, TRAPEZIUM_NAME);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void showUniqueProperty() {
        double median = 0.5 * (firstBase + secondBase);
        System.out.format("The Median of a trapezium = %.2f \n", median);
    }

    @Override
    protected double getArea() {
        double area = 0.5 * (firstBase + secondBase)*height;
        return (double) Math.round(area * 100) / 100;
    }

}
