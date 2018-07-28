package com.design.factory.func;

/**
 * 工厂方法
 * 特点：
 *      1、符合实际，Audi、Bmw、Benz都拥有自己的工厂，直接向抽象工厂Factory索要就行
 *      2、可以一定程度增加扩展性，若增加一个产品实现，只需要实现产品接口，修改工厂创建产品的方法，
 *         消费者可以无感知（若消费者不关心具体产品是什么的情况）
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new AudiFactory();
        System.out.println(factory.getCar());
    }
}
