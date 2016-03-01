package org.bad.learningjava;

/**
 * Created by didierbaczynski on 2016-02-29.
 */
public class Circle {
    private double radius;
    private static final double pi=3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return (pi*radius);
    }
}
