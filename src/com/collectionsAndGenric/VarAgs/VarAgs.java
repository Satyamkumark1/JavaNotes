package com.collectionsAndGenric.VarAgs;

public class VarAgs {



    public  int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum+=i;

        }
        return sum;

    }

    public static void main(String[] args) {
        VarAgs varAgs = new VarAgs();
        System.out.println( varAgs.sum(11,1,123,21));

    }
}
