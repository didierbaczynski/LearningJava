package org.bad.learningjava;

/**
 * Created by didierbaczynski on 2016-02-29.
 */
public class Rectangle {
    private double height;
    private double length;

    public Rectangle(double height, double length) {
        setHeight(height);
        setLength(length);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return (getLength()*getHeight());
    }

}
