package com.telran.prof.org.classwork.lessonone.dog;

public class DogApp {

    public static void main(String[] args) {
        //                                    имя класса и ()
        //Тип_переменной имя_переменной = new Вызов конструктора объекта
        Dog smallDog = new Dog(); // экземпляр класса Dog
        smallDog.age = 5;
        smallDog.breed = "Shepard";
        smallDog.color = "Black";

        smallDog.voice();

        System.out.println("Small dog with breed " + smallDog.breed +
                " , with age " + smallDog.age + " , color " + smallDog.color);

        Dog bigDog = new Dog();
        bigDog.color = "White";
        bigDog.breed = "Yard";
        bigDog.age = 12;

        bigDog.voice();

        System.out.println("Big dog with breed " + bigDog.breed +
                " , with age " + bigDog.age + " , color " + bigDog.color);

        System.out.println(smallDog);
        System.out.println(bigDog);

    }
}

