package utils;

import colorenum.Color;
import common.BaseFigure;
import figures.Circle;
import figures.Square;
import figures.Trapezium;
import figures.Triangle;

import java.util.ArrayList;
import java.util.List;

public class FiguresGenerator {

    private final int MAX_FIGURES_COUNT = 20;
    private final int MAX_FIGURES_VALUE = 100;
    private final int MAX_FIGURES_VARIANTS = 4;
    private final int MAX_COLORS_VARIANTS = 4;

    public List<BaseFigure> generateFigures() {
        int figuresCount = getRandom(MAX_FIGURES_COUNT);
        List<BaseFigure> figures = new ArrayList<>();
        for (int i = 0; i < figuresCount; i++) {
            figures.add(getFigure());
        }
        return figures;
    }

    private BaseFigure getFigure() {
        int random = getRandom(MAX_FIGURES_VARIANTS);
        String randomColor = getRandomColor();
        switch (random) {
            case 1:
                return new Circle(getRandom(MAX_FIGURES_VALUE), randomColor);
            case 2:
                return new Square(getRandom(MAX_FIGURES_VALUE), randomColor);
            case 3:
                return new Triangle(getRandom(MAX_FIGURES_VALUE), getRandom(MAX_FIGURES_VALUE), randomColor);
            case 4:
                return new Trapezium(getRandom(MAX_FIGURES_VALUE), getRandom(MAX_FIGURES_VALUE), getRandom(MAX_FIGURES_VALUE), randomColor);
        }
        return new Circle(getRandom(MAX_FIGURES_VALUE), randomColor);
    }

    private int getRandom(int bound) {
        return (int) (Math.random() * bound + 1);
    }

    private String getRandomColor() {
        int random = getRandom(MAX_COLORS_VARIANTS);
        switch (random) {
            case 1:
                return Color.RED.getColor();
            case 2:
                return Color.GREEN.getColor();
            case 3:
                return Color.BLUE.getColor();
            case 4:
                return Color.ORANGE.getColor();
        }
        return Color.RED.getColor();
    }
}
