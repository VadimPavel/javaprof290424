package com.telran.prof.org.classwork.lessonone.studentapp;

public class StudentApp {

    public static void main(String[] args) {
        Student one = new Student("Alex", "Alexeev", 20);

        System.out.println("1 Student : name :" + one.getName()
                + " surname : " + one.getSurname());

        one.setRate(4);
        one.setGroupNumber("2904024");

        System.out.println("2 Student : name :" + one.getName() + " surname : " + one.getSurname()
                + " age " + one.getAge() + " rate " + one.getRate());

        Student two = new Student("Oleg", "Olegov", 25);

        System.out.println("3 "+ one);
        System.out.println("4 "+two);

        one.greetings();
        two.greetings();

    }

}
