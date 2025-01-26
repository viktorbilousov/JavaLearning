package example.printer;

import example.model.Animal;

public class AnimalPrinter {

    protected void printOneAnimal(Animal animal){
        animal.makeSound();
    }

    public final void makeSoundsFromAnimals(Animal[] animals){
        for (Animal animal : animals) {
            printOneAnimal(animal);
        }
    }
}
