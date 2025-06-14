package com.Collections.Challenges;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Third {

    public  static  void reverseList(List<Integer> list) {

        Collections.reverse(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,34,5,56,6,6);
        reverseList(list);

    }
}
