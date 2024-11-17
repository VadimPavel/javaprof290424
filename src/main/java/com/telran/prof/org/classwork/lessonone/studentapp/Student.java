package com.telran.prof.org.classwork.lessonone.studentapp;

public class Student {

    //   4 модификатора доступа
    // default - отсутствие какого либо модификатора
    // public - доступ отовсюду(самый открытый модификатор доступа)
    // protected - доступ из наследников(когда мы можем получить к этим переменным
    // name, surname, age, rate, groupNumber доступ внутри класса и классов наследников)
    // private(этот модификатор доступа который обеспечивает нам принцип инкапсуляции)

    private String name;

    private String surname;

    private int age;

    private double rate;

    private String groupNumber;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void greetings() {

        System.out.println("I am student " + name + " " + surname + " Hello!");
    }

    //getters!!!
    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }

    public int getAge() {

        return age;
    }

    public double getRate() {

        return rate;
    }

    public String getGroupNumber() {

        return groupNumber;
    }

    public void setRate(double rate) {
        if (rate < 0 || rate > 5) {  // логика, если значение не попадает в диапазон от 0 до 5
                                     // то просто выйди из этого метода return и ничего не устанавливай;
            return;
        }
        this.rate = rate;
    }

    public void setGroupNumber(String groupNumber) {

        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }

}
