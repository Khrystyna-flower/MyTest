package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {

    private String name;
    private String sound;

    public Cat(String name) {
        this.name = name;
        this.sound = "Meow";
    }

    @Override
    public void sound() {
        System.out.println("I am a Cat. My name " + name + ". " + sound + ".");
    }
}
