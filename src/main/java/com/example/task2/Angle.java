package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Angle extends Shape {
    @Override
    double area() {
        return 0;
    }

    public Angle(double x, double y, Color color) {
        super(x, y, color);
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(color);
        gr.setLineWidth(10);
        gr.fillRect(x, y, 170, 5);

        gr.strokeRect(x, y, 170, 5);
        gr.strokeRect(x, y, 5, 170);
    }

    @Override
    public String toString() {
        return "Angle";
    }
}
