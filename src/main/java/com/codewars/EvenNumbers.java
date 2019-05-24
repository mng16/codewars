package com.codewars;

import java.util.ArrayList;

public class EvenNumbers {

    public static int[] divisibleBy(int[] numbers, int divider) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] % divider == 0) {
                arrList.add(numbers[i]);
            }
        }

        int[] result = new int[arrList.size()];

        for(int i=0; i<arrList.size(); i++) {
            result[i] = arrList.get(i);
        }

        return result;

    }
}
