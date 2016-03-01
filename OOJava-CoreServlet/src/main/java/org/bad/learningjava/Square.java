package org.bad.learningjava;

/**
 * Created by didierbaczynski on 2016-02-29.
 */
public class Square extends Rectangle {
    public Square(double height) {
        super(height,height);
    }

    public void setArea(double area){
        this.setHeight(Math.sqrt(area));
        this.setLength(Math.sqrt(area));
    }
}

