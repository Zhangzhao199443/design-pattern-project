package com.design.factory.simple;

import com.design.factory.Audi;
import com.design.factory.Benz;
import com.design.factory.Bmw;
import com.design.factory.Car;

/**
 * 简单工厂
 * 特点：
 *      1、它是一个具体的类，非接口 抽象类。
 *      2、扩展性差，当再需要一种车时，太需要修改工厂的方法。
 *      3、不同的产品需要不同额外参数的时候 不支持。
 *      4、不符合实际，实际情况中没有一种工厂（比如：SimpleFactory），即可以生产奥迪，又可以生产宝马，又可以生产奔驰
 */
public class SimpleFactory {
    public static Car getCar(String carName){
        if("Audi".equals(carName)){
            return new Audi();
        }else if("Benz".equals(carName)){
            return new Benz();
        }else if("Bmw".equals(carName)){
            return new Bmw();
        }else {
            return null;
        }
    }
}
