package com.design.factory.abstr;

public class AccessDepartment implements IDepartment{
    public void insert() {
        System.out.println("insert accessDepartment");
    }

    public void getDepartmentById() {
        System.out.println("get accessDepartment by id");
    }
}
