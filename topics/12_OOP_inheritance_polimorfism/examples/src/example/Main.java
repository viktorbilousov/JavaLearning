package example;

import example.model.*;
import example.printer.AnimalPrinter;
import example.printer.NewAnimalPrinter;

// Основной класс
public class Main {


    public static void makeSoundsFromAnimals(Animal[] animals){
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();

        Animal myDog = new Dog("DogName");
        Animal myCat = new Cat("CatName");





        NewAnimalPrinter newAnimalPrinter = new NewAnimalPrinter();

        AnimalPrinter printer = new NewAnimalPrinter();
        printer.makeSoundsFromAnimals(new Animal[]{myAnimal, myCat, myDog});

    }
}
