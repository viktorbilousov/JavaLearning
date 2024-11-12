// Базовый класс
class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Подкласс Собака
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав");
    }
}

// Подкласс Кошка
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает: Мяу-мяу");
    }
}

// Основной класс
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();  // Вывод: Животное издает звук
        myDog.makeSound();     // Вывод: Собака лает: Гав-гав
        myCat.makeSound();     // Вывод: Кошка мяукает: Мяу-мяу
    }
}
