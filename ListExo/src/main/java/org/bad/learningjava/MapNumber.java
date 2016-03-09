package org.bad.learningjava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by didierbaczynski on 2016-03-02.
 */
public class MapNumber {
    private static String[] numberWords = {"un","deux","trois","quatre","cinq","six","sept",
                                    "huit","neuf","dix","onze","douze","treize","quatorze",
                                    "quinze","seize","dix-sept","dix-huit","dix-neuf","vingt"};
    private Map<Integer,String> numberTable;

    public MapNumber(){
        this(numberWords);
    }

    public MapNumber(String[] listWords) {
        numberTable = new HashMap<Integer, String>();

        for (int i = 0; i < numberWords.length; i++) {
            numberTable.put(i+1,numberWords[i]);
        }
    }

    public String getNumberWord(int i){
        return numberTable.getOrDefault(i,"[unknown]");
    }
}
