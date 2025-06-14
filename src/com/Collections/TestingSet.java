package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("satyam");
        set.add("shivam");

        Utility.print(set);

        System.out.println(set.remove("satyam"));
        Utility.print(set);

    }
}
