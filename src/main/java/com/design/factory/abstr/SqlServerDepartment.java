package com.design.factory.abstr;

public class SqlServerDepartment implements IDepartment{
    public void insert() {
        System.out.println("insert sqlserverDepartment");
    }

    public void getDepartmentById() {
        System.out.println("get sqlserverDepartment by id");
    }
}
