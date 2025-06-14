package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
         List<String> stringList = new ArrayList<>();
         stringList.add("satyam");
         stringList.add("Shalini");

         stringList.add(1,"loves");
         if(stringList.contains("loves")){
             for (String s : stringList) {
                 System.out.print(" ");
                 System.out.print(s);

             }

         } else {
             System.out.println("Doesnt exist :");
         }




    }
}