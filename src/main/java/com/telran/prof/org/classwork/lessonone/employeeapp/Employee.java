package com.telran.prof.org.classwork.lessonone.employeeapp;

//Name - UpperCamelCase
//BookStorage, ErrorHandler
// (Имена классов всегда в единственном числе существительном Book, Ticket)
public class Employee {

    String name;

    int age;

    String position;

    double salary;

    // Этот метод и есть конструктор который вызывается
    // при создании объекте работника(Employee)
    // Данный метод не имеет никакого возвращаемого значения,
    // то есть у него между public и именем класса нет ничего.
    // Нет никакого void(a) типа данных.
    public Employee() {

    }

    // метод с некоторыми параметрами т.е принимает 2 параметра
    // и внутри этого метода мы напишем логику в которую в переменную name и age
    // присвоим значение нашему работнику name = empName; age = empAge;
    // которую передадим вот сюда в эту переменную String empName, int empAge.
    public Employee(String empName, int empAge) {
        name = empName;
        age = empAge;
    }

    // метод со всеми перечисленными параметрами
    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }
}
