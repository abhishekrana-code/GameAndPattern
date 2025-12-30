package com.tricks;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // Parent reference, child object
        a.makeSound();         // Calls Dog's overridden method → "Woof! Woof!"


    }
}

