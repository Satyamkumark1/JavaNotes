package com.Collections.Challenges;

public class First {


    public  String string(String... str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : str) {
            stringBuilder.append(s).append(" ");
        }
        return stringBuilder.toString();


    }
    public static void main(String[] args) {
        First first = new First();

        System.out.println(first.string("satyam" , "kumar"));


    }

}
