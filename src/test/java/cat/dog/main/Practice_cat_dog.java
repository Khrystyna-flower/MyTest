package cat.dog.main;

import oop_practice.cat_dog.animal.Animal;
import oop_practice.cat_dog.cat.Cat;
import oop_practice.cat_dog.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {

    public static void main(String... args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
