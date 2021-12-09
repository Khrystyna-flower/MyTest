package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {

    private String name;
    private String sound;

    public Dog(String name) {
        this.name = name;
        this.sound = "Gav";
    }

    @Override
    public void sound() {
        System.out.println("I am a Dog. My name " + name + ". " + sound + ".");
    }

}
