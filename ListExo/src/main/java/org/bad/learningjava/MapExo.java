package org.bad.learningjava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by didierbaczynski on 2016-02-29.
 */
public class MapExo {
    public static void main(String[] args) {
        String[][] CIOarray = {
                {"a1234","Steve Jobs"} ,
                {"a1235","Scott McNealy"},
                {"a1236","Jeff Bezos"},
                {"a1237","Larry Ellison"},
                {"a1238","Bill Gates"}
        };
        Map<String,String> CIOMap = new HashMap<String, String>();
        for (String[]CIO:CIOarray) {
            CIOMap.put(CIO[0],CIO[1]);
        }
        System.out.printf("CIO a1234 %s %n", CIOMap.get("a1234"));
        System.out.printf("CIO a1235 %s %n", CIOMap.get("a1235"));
    }
}
