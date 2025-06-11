package com.ArrayChallange;

public class ArrayOperations {
    private  int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    protected class  Statistics {
        double mean() {
            double sum = 0;
            for (int number : numbers) {
                sum+=number;
            }
            return  sum / numbers.length;

        }
        double median() {
            return 0;
        }
    }

}
