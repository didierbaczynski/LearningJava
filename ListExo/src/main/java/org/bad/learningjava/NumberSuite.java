package org.bad.learningjava;

/**
 * Created by didier_baczynski on 2016-04-03.
 */
public class NumberSuite {
    public static void main(String[] args) {
        int numberInSuite = 0;
        int numberToAdd=1;
        for (int i = 0; i <100 ; i++) {
            numberInSuite=numberInSuite+numberToAdd;
            numberToAdd=numberToAdd+2;
            System.out.printf("Suite number[%d] is %d %n",i+1,numberInSuite);
        }
    }
}
