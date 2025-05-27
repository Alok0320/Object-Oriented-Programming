package Introduction;
// package Inheritance;

class parentClass{
    void display(){
        System.out.println("Parent class method");
    }
}

class childClass extends parentClass{
    void show(){
        System.out.println("Child class method");
    }
}
public class Inheritance {
    
public static void main(String[] args) {
    childClass child1 = new childClass();
    child1.display();  // child class ka method use krke parent class ka method access kr pa rha hun
    System.out.println();
    child1.show();
}

}

    // Inheritance in java is a mechanism in which one class inherits 
    // the properties of other class.

    // In other words, inheritance is the nechanism of building a 
    // new class on the existing functionality of a super class.

    // Use cases -

    // -> Method overriding 
    // -> Reuse the code and reduce the duplication.


    
    // Vehicle -> Parent class               Car -> Child class
    //      -> Mileage                           -> Fuel type
    //      -> Color                             -> Sunroof
    //      -> Price


    // Sub class / child class  -> jo inherit krta h 
    // Super class / Parent class  -> jisase inherit ki jati h 
    // Inherits  -> cheejen lena


    // Extends Keyword  ->  
    //            We use it while writing child class 
    //  Class childClass extends parentclass


    // IS-A RELATIONSHIP  ->  child class -----> (is-a) parent class

    // HAS-A relationship ->  car has a engine

    // Types of Inheritance --> 
    //                         1. Single Inheritance
    //                         2. Multi-level Inheritance
    //                         3. Multiple Inheritance
    //                         4. Hierarchical Inheritance

    