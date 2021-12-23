package com.company;

import java.util.ArrayList;
import java.util.List;

public class Calc<T extends Number> {

    public <T extends Number> double sum (T number1, T number2, T number3) {
        return number1.doubleValue() + number2.doubleValue() + number3.doubleValue();
    }

}
