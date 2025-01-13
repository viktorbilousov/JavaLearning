package example;

import example.model.Animal;
import example.model.Cat;
import example.model.Dog;

// Основной класс
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog("DogName");
        Animal myCat = new Cat("CatName");

        myAnimal.makeSound();  // Вывод: Животное издает звук
        myDog.makeSound();     // Вывод: Собака лает: Гав-гав
        myCat.makeSound();     // Вывод: Кошка мяукает: Мяу-мяу
    }
}
