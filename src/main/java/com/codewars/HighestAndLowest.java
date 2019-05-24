package com.codewars;

public class HighestAndLowest {
    public static String HighAndLow(String numbers) {

        String[] arrString = numbers.split(" ");

        int high = Integer.parseInt(arrString[0]);
        int low = Integer.parseInt(arrString[0]);


        for(int i=0; i<arrString.length; i++) {
            int current = Integer.parseInt(arrString[i]);
            if (Integer.parseInt(arrString[i]) > high) {
                high = current;
            } else if (current < low) {
                low = current;
            }
        }

        String result = high + " " + low;

        // Code here or

        return result;
    }
}