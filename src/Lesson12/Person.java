package Lesson12;
//1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.//
//Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.//


public class Person {
    private String name;
    private String surName;
    private int age;
    private int weigt;
    private int height;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigt() {
        return weigt;
    }

    public void setWeigt(int weigt) {
        this.weigt = weigt;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
