package main;

import common.BaseFigure;
import utils.FiguresGenerator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FiguresGenerator figuresGenerator = new FiguresGenerator();
        List<BaseFigure> figures = figuresGenerator.generateFigures();
        for (int i = 0; i < figures.size(); i++) {
            BaseFigure currentFigure = figures.get(i);
            currentFigure.drawFigure(currentFigure.name);
            currentFigure.showUniqueProperty();
        }
    }
}
