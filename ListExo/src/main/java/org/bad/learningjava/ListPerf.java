package org.bad.learningjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by didierbaczynski on 2016-03-04.
 */
public class ListPerf {
    public static int listSize = 10000000;
    public static int qantityToRetrieve = 1000;
    public static int loopNumber = 5;

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<String>();
        List<String> arrayList = new ArrayList<String>();
        feelList(linkedList);
        feelList(arrayList);
        long startTime = System.nanoTime();
        accessList(linkedList);
        long endTime = System.nanoTime();
        double duration = (endTime-startTime)/10E9;
        System.out.printf("duration %f %n",duration);

        startTime = System.nanoTime();
        for (int i = 0; i < loopNumber ; i++) {
            accessList(arrayList);
        }
        endTime = System.nanoTime();
        duration = (endTime-startTime)/1E9;
        System.out.printf("duration %f %n",duration);
    }

    public static void feelList (List varList){
        for (int i = 0; i < listSize; i++) {
            varList.add(i,"Entry"+i);
        }
    }

    public static void accessList(List<String> varList){
        int startIndex = listSize/2;
        String entry = new String();
        for (int i = startIndex; i <(startIndex+loopNumber) ; i++) {
            entry = varList.get(i);
        }
    }
}
