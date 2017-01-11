package com.allstate.models;

import java.util.stream.IntStream;

/**
 * Created by localadmin on 11/01/17.
 */
public class Maths {
    private static int result = 0;
    public static int square(int num){
        return num*num;
    }
    public static int factorial(int num){
        return IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
    }

    public static int fibinocci(int num) {
        if (num < 0)
            result = -1;

        else if (num == 0)
            result = 0;
        else if (num == 1)
            result = 1;


        else if (num > 1)
            result = fibinocci(num - 1) + fibinocci(num - 2);

        return result;
    }


}
