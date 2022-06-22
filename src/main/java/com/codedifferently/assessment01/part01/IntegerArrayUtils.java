package com.codedifferently.assessment01.part01;

public class IntegerArrayUtils {
    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */
    public static Integer getSum(Integer[] intArray){
        Integer sum = 0;
        for(int i =0 ; i < intArray.length; i ++) {
            sum += (Integer) intArray[i];
        }
        return sum;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        Integer product = 1;
        for(int i =0 ; i < intArray.length; i ++) {
            product *= (Integer) intArray[i];
        }
        return product;
    }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray){
        Integer sum = getSum(intArray);
        Double average = (double) sum / (double) intArray.length;
        return average;
    }
}
