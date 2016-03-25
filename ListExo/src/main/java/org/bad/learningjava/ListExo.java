package org.bad.learningjava;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by didierbaczynski on 2016-02-29.
 */
public class ListExo {
    public static void main(String[] args) {
        Double CircleRadius = Math.random();
        List<Circle> CircleList = new LinkedList<Circle>();
        while (CircleRadius > 0.01) {
            CircleList.add(new Circle(CircleRadius));
            CircleRadius = Math.random();
        }
        for (Circle myCircle : CircleList) {
            System.out.printf("myCircle= %f %n",myCircle.getSurface());
        }
    }
}
