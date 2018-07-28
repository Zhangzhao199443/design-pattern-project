package com.design.factory.abstr;

public class AccessUser implements IUser{
    public void insert() {
        System.out.println("insert accessUser");
    }

    public void getUserById() {
        System.out.println("get accessUser by id");
    }
}
