package com.example.task2;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;


public class ShapeFactory {
    private HashMap<Integer, Shape> coll = new HashMap<Integer, Shape>();
    public Shape createShape(int numberOfSides) {
        coll.put(1, new Circle(1,1,100, Color.GREEN));
        coll.put(2, new Angle(1,1, Color.BLACK ));
        coll.put(3, new Triangle(1,1, Color.BLACK));
        coll.put(4, new Square(1,1, Color.BLACK));
        return coll.get(numberOfSides);
    }



}
