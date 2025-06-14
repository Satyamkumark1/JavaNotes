package com.Collections.Challenges;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Second {

    public  static  void swap(List<Integer> list , int x,int y) {
        Collections.swap(list,x,y);
    }

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,4,3,2,3);
        System.out.println(list);

       swap(list,2,3);
        System.out.println(list);



    }
}