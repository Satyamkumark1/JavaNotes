package com.Collections;

import java.util.Collection;
import java.util.Collections;

public class Utility {
    public  static  <E>void  print( Collection  <E>coll) {
        for (E c : coll) {
            System.out.println(c);
            
        }

    }
}
