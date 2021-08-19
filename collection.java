package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection {
    public static void main(String[] args) {
        Collection<Integer> values = new ArrayList<>();
       // values.add("hello");
      //  values.add("hi");
        values.add(10);
        values.add(21);
      //  values.add(7.21);

        Iterator it = values.iterator();
        
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------------------");

        for(Object i: values){
            System.out.println(i);
        }
    }
}
