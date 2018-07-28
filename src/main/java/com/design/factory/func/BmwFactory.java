package com.design.factory.func;

import com.design.factory.Bmw;
import com.design.factory.Car;

public class BmwFactory implements Factory{
    public Car getCar() {
        return new Bmw();
    }
}
