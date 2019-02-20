package figures;

import common.BaseFigure;

public class Square extends BaseFigure {

    private int sideSize;
    private static final String SQUARE_NAME ="Square";

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }

    public Square(int sideSize, String color) {
        super(color, SQUARE_NAME);
        this.sideSize = sideSize;
    }

    @Override
    public void showUniqueProperty() {
        System.out.println("Square side size is " + sideSize + ".");
    }

    @Override
    protected double getArea() {
        double area = sideSize * sideSize;
        return (double) Math.round(area * 100) / 100;
    }

}
