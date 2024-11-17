package com.telran.prof.org.classwork.lessonone.phone;

public class Phone {

    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public void call(String number) {
        System.out.println("Phone " + model + "call to number " + number);
    }
}
