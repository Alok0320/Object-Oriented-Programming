package Basics;
// package oops;

public class Dog {  // class

    // Attribute
    String name;

    // Behaviour
    public void eat(){   // Method
        System.out.println(name+ " eats!");
    }

    public static void main(String[] args) {  // main class 
        Dog dog = new Dog(); // Object Creation
        dog.name = "jacky";  // Accessing property from class and assigning value to it 
        dog.eat(); // Method calling
        
    }
}


