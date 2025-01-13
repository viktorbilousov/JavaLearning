package example.model;

// Подкласс Кошка
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает: Мяу-мяу");
    }
}

