package com.design.factory.simple;

import com.design.factory.Car;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Car car = SimpleFactory.getCar("Audi");
        System.out.println(car);
    }
}
