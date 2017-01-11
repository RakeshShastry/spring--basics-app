package com.allstate.models;

import java.awt.*;

public class PointsCordinates {
    private double xcordinate;
    private double ycordinate;

    public PointsCordinates(double xcordinate, double ycordinate) {
        this.xcordinate = xcordinate;
        this.ycordinate = ycordinate;
    }

    public double getXcordinate() {
        return xcordinate;
    }

    public double getYcordinate() {
        return ycordinate;
    }

    public static double distance(PointsCordinates p1,PointsCordinates p2){
        double i=2;
        double xpath=Math.pow((p2.getXcordinate()-p1.getXcordinate()),i);
        double ypath=Math.pow((p2.getYcordinate()-p1.getYcordinate()),i);
        double result=Math.sqrt(xpath+ypath);
        return Math.floor(result);

    }

    public static double slope(PointsCordinates p1,PointsCordinates p2){
        double xpath=p2.getYcordinate()-p1.getYcordinate();
        double ypath=p2.getYcordinate()-p1.getYcordinate();
        double slopevalue=ypath/xpath;
        return Math.floor(slopevalue);
    }

    public static double yintercept(PointsCordinates p1,PointsCordinates p2){
        double slopevalue=PointsCordinates.slope(p1,p2);
        double yinterceptvalue = p1.getYcordinate()-(slopevalue* p1.getXcordinate());
        return Math.floor(yinterceptvalue);
    }

}
