package com.company;

public class Main {

    public static void main(String[] args) {
	    Calc<Integer> calcInt = new Calc<>(1, 2, 3);
        Double intSum = calcInt.sum();
        System.out.println(intSum);

        Calc<Double> calcDouble = new Calc<>(1.2, 2.4, 3.7);
        Double doubleSum = calcDouble.sum();
        System.out.println(doubleSum);

        Double intDoubleFloatSum = calcDouble.sum(12, 11.34, 12.1f);
        System.out.println(intDoubleFloatSum);
    }
}
