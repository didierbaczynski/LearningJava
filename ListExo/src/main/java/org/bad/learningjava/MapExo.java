package org.bad.learningjava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by didierbaczynski on 2016-02-29.
 */
public class MapExo {
    public static Map<String,String> CIOMap = new HashMap<String, String>();

    public static void main(String[] args) {
        String[][] CIOarray = {
                {"a1234","Steve Jobs"} ,
                {"a1235","Scott McNealy"},
                {"a1236","Jeff Bezos"},
                {"a1237","Larry Ellison"},
                {"a1238","Bill Gates"}
        };

        for (String[]CIO:CIOarray) {
            CIOMap.put(CIO[0].toLowerCase(),CIO[1]);
        }
        System.out.printf("CIO a1234 %s %n", CEOLookUp("A1234"));
        System.out.printf("CIO a1235 %s %n", CEOLookUp("a1235"));
    }

    public static String CEOLookUp (String CEOid){
        return CIOMap.get(CEOid.toLowerCase());
    }
}
