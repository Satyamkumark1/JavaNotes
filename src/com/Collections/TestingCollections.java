package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {


                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(2);
                list.add(0);

                Utility.print(list);

        Collections.sort(list);


        Collections.reverse(list);

        Utility.print(list);



    }
}
