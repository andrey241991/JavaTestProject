package common;

public abstract class BaseFigure {
    private String color;
    public String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseFigure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void drawFigure(String figureName) {
        StringBuilder builder = new StringBuilder();
        builder.append(figureName);
        builder.append(" area is ");
        builder.append(getArea());
        builder.append(". ");
        builder.append(figureName);
        builder.append(" color is ");
        builder.append(color);
        builder.append(".");
        System.out.println(builder.toString());
    }

    public abstract void showUniqueProperty();

    protected abstract double getArea();

}
