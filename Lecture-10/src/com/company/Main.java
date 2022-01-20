package com.company;

public class Main {

    public static void main(String[] args) {
        Calc<Integer, Double, Float> calcDouble = new Calc<>();
        Double intDoubleFloatSum = calcDouble.sum(12, 11.34, 12.1f);
        System.out.println(intDoubleFloatSum);
    }
}
