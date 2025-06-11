package com;

public class TestAccount {
    public static void main(String[] args) {
        Employee employee = new Employee("Satyam" ,"20", 2121.122);
        System.out.println(employee.getEmployeeDetials());
        employee.setSalary(2213232.323);
        System.out.println(employee.getEmployeeDetials());

    }
}
