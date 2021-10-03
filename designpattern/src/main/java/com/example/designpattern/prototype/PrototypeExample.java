package com.example.designpattern.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Person person1 = new Person("Glenn");
        System.out.println("person 1:" + person1);
        Person person2 = (Person) person1.doClone();
        System.out.println("person 2:" + person2);
        Cat cat1 = new Cat("Meow");
        System.out.println("cat 1:" + cat1);
        Cat cat2 = (Cat) cat1.doClone();
        System.out.println("cat 2:" + cat2);
    }
}