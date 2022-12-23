package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

    @Override
    double area() {
        return 0;
    }

    public Square(double x, double y, Color color) {
        super(x, y, color);
    }
    @Override
    void draw(GraphicsContext gr) {
        gr.setStroke(color);
        gr.setLineWidth(10);
        gr.strokeRect(x, y, 150, 150);
    }

    @Override
    public String toString() {
        return "Square";
    }
}
