package com.example;



// Define an interface
interface Animal {
    void makeSound();
}

// Define a class that implements the interface
class Dog implements Animal {
    // Instance variable
    private String name;

    // Constructor
    public Dog(String name) {
        this.name = name;
    }
    // Constructor
    public Dog() {
        this.name = "tarzon";
    }

    // Method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Utils.printMessage();
        Dog tarzon1 = new Dog();
        tarzon1.makeSound();

        Dog tarzon2 = new Dog();
        tarzon2.makeSound();

        Dog tarzon3 = new Dog();
        tarzon3.makeSound();

        Dog tarzon4= new Dog();
        tarzon4.makeSound();

        Dog myPetDog = new Dog("Buddy");

        // Call the method
        myPetDog.makeSound();
        if (args.length > 0) {
            // Use the first command-line argument as the dog's name
            String dogName = args[2];
            Dog myDog = new Dog(dogName);
            myDog.makeSound();
        } else {
            System.out.println("Please provide a dog's name as a command-line argument.");
        }
    }
}




