package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {
    
    public List<String> tails(String value) {
        ArrayList<String> list = new ArrayList<>();
        list.add(value);
        list.add("nieiskotne");
        list.add(value.substring(2));
        for(int i =0;i<value.length() - 3;i++)
            list.add("nieiskotne");
        list.add("");
        
        return list;
    }

}
