package example.model;

// Базовый класс
public class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

}