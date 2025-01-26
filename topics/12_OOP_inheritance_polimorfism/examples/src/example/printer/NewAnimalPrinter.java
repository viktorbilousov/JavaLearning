package example.printer;

import example.model.Animal;
import example.model.Dog;

public class NewAnimalPrinter extends AnimalPrinter{

    public NewAnimalPrinter() {
        super();
    }

    @Override
    protected void printOneAnimal(Animal animal) {
        System.out.println(animal.getName());
        super.printOneAnimal(animal);

        if(animal instanceof Dog){
            Dog d = (Dog) animal;
            System.out.println(d.getCommnad());
        }
    }
}
