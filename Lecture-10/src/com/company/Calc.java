package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calc<T extends Number> {
    T number1;
    T number2;
    T number3;

    public Calc(T number1, T number2, T number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public double sum () {
        return number1.doubleValue() + number2.doubleValue() + number3.doubleValue();
    }

    public <T extends Number> double sum (T number1, T number2, T number3) {
        return number1.doubleValue() + number2.doubleValue() + number3.doubleValue();
    }

}
