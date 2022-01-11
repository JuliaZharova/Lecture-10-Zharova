package com.company;


public class Calc<TFirst extends Number, TSecond extends  Number, TThird extends  Number> {

    public double sum (TFirst number1, TSecond number2, TThird number3) {
        return number1.doubleValue() + number2.doubleValue() + number3.doubleValue();
    }

}