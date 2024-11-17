package com.telran.prof.org.classwork.lessonone.employeeapp;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee empOne = new Employee(); // after(после) new - вызов конструктора объекта
        empOne.age = 25;
        empOne.name = "Alex";
        empOne.position = "worker";
        empOne.salary = 3546.5;

        Employee empTwo = new Employee("Oleg", 40);
        empTwo.salary = 2444;
        empTwo.position = "security";

        Employee empThree = new Employee("Egor", 24, "cleaner", 1000);

        System.out.println(" " + empOne.name + " " + empOne.age + " " + empOne.position + " " + empOne.salary);

        System.out.println(" " + empTwo.name + " " + empTwo.age + " " + empTwo.position + " " + empTwo.salary);

        System.out.println(" " + empThree.name + " " + empThree.age + " " + empThree.position + " " + empThree.salary);
    }
}
