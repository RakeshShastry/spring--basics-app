package com.allstate.models;


import java.awt.*;
import java.util.List;

public class Triangle {
    private int height;
    private int width;


    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public Triangle() {
    }

    public int getWidth() {
        return width;

    }
    public double getArea() {
        return height*width*0.5;
    }

    public static double area(List<Triangle> triangles){
        double areaOfTriagle=triangles.stream().map((tri) -> (tri.height * tri.width * 0.5)).reduce((double)0,(a,c)->a+c);
        return areaOfTriagle;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

}
