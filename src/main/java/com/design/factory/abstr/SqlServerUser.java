package com.design.factory.abstr;

public class SqlServerUser implements IUser{
    public void insert() {
        System.out.println("insert into sqlserverUser");
    }

    public void getUserById() {
        System.out.println("get sqlserverUser by id");
    }
}
