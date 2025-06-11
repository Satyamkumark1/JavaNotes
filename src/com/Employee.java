package com;

public class Employee {
    private String name;
    private  String age;
    private double salary;

    public Employee(String name, String age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    String getEmployeeDetials(){
        return  "EmployeeDetails:  Name :"
                + name+", Age:"+
                age+",Salary:" +
                salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
