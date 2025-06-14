package com.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);


        queue.offer(111);

        Utility.print(queue);
        queue.peek();
        Utility.print(queue);




    }

}
