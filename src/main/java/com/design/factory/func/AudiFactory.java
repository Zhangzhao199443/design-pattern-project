package com.design.factory.func;

import com.design.factory.Audi;
import com.design.factory.Car;

public class AudiFactory implements Factory{
    public Car getCar() {
        return new Audi();
    }
}
