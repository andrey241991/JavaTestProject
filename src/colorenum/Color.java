package colorenum;

public enum Color {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue"),
    ORANGE("Orange");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
