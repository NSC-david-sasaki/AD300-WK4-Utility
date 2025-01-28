package org.example;

public class MathUtils {
    public static int addInt(int a, int b){
        return a+b;
    }

    public static int subtractInt(int a, int b){
        return a-b;
    }

    public static int multiplyInt(int a, int b){
        return a*b;
    }

    public static double divideInt(int a, int b){
        if(b == 0){
            return Double.NaN;
        }
        else{
            return (int)(a/b); // only quotient no remainder
        }
    }


}
