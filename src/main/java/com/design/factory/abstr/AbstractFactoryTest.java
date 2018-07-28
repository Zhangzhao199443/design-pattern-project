package com.design.factory.abstr;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory factory = new SqlServerFactory();
        IDepartment department = factory.createDepartment();
        department.insert();
        department.getDepartmentById();
        IUser user = factory.createUser();
        user.insert();
        user.getUserById();
    }
}
