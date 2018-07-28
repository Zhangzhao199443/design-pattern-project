package com.design.factory.func;

import com.design.factory.Benz;
import com.design.factory.Car;

public class BenzFactory implements Factory{
    public Car getCar() {
        return new Benz();
    }
}
