/**
 * Demonstrates the concept of Method Overriding in Java.
 * The parent class Animal has a sound() method which is overridden
 * by the subclasses Dog and Cat to provide specific implementations.
 */

class Animal {
    /**
     * Method that will be overridden by subclasses.
     * Default sound for an animal.
     */
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    /**
     * Overrides the sound() method to provide a specific sound for Dog.
     */
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    /**
     * Overrides the sound() method to provide a specific sound for Cat.
     */
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    /**
     * The main method to test method overriding.
     * Demonstrates polymorphism by calling the overridden sound() methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Parent class reference holding a parent object
        Animal myAnimal = new Animal();  
        
        // Parent class reference holding a Dog object
        Animal myDog = new Dog();        
        
        // Parent class reference holding a Cat object
        Animal myCat = new Cat();        
        
        // Calling the overridden methods
        myAnimal.sound();  // Calls Animal's sound method
        myDog.sound();     // Calls Dog's overridden sound method
        myCat.sound();     // Calls Cat's overridden sound method
    }
}
