package com.design.factory.abstr;

/**
 * 抽象工厂
 * 特点：
 *      1、提供一个创建一系列相关相互依赖对象的接口，而无需指定他们具体的类。
 *      2、抽象工厂为不同产品族的对象创建提供接口。
 */
public interface IFactory {
    public IUser createUser();
    public IDepartment createDepartment();
}
