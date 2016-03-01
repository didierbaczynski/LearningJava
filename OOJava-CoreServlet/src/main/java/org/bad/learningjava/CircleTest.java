package org.bad.learningjava;

/**
 * Created by didierbaczynski on 2016-02-29.
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        double sumCircle = 0,maxSurface = 0,minSurface = 0;


        System.out.println("test surface ="+c.getSurface());
        /*create an array of 100 circles*/
        Circle[] circles = new Circle[100];
        for (int i = 0; i < circles.length ; i++) {
            circles[i]=new Circle(Math.random()*10);
            sumCircle=sumCircle+circles[i].getSurface();
            if (circles[i].getSurface() > maxSurface) {
                maxSurface = circles[i].getSurface();
            }
            if (i==0){
                minSurface = circles[i].getSurface();
            }
            if (circles[i].getSurface() < minSurface) {
                minSurface = circles[i].getSurface();
            }
        }
        System.out.println("sumCircle = " + sumCircle);
        System.out.println("maxSurface = " + maxSurface);
        System.out.println("minSurface = " + minSurface);

        /*test rectangle*/
        Rectangle rectangle = new Rectangle(Math.random()*100,Math.random()*100);
        System.out.println("rectangle = " + rectangle.getArea());
        /*test square*/
        Square square = new Square(Math.random()*100);
        System.out.println("square = " + square.getArea());
        square.setArea(4);
        System.out.println("square after set area = " + square.getArea());
    }
}
