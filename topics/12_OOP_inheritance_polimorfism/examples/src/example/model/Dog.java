package example.model;

// Подкласс Собака
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав");
    }
}
