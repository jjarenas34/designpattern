package com.example.designpattern.prototype;

public class Cat implements Prototype {
    String sound;
    public Cat(String sound) {
        this.sound = sound;
    }
    @Override
    public Prototype doClone() {
        return new Cat(sound);
    }
    public String toString() {
        return "This cat says " + sound;
    }
}