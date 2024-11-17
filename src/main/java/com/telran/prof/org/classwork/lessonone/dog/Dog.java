package com.telran.prof.org.classwork.lessonone.dog;

//Любой объект имеет состояние и поведение
public class Dog {
    //характеристики объекта / свойства объекта/ поля класса / переменные класса
    String breed; // default null

    int age; // default 0

    String color; // default null

    //все свойства вместе определяют состояние объекта
    //методы определяют поведение объекта
    void sleeping() {

    }

    void voice() {

        System.out.println("I am dog with age " + age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

