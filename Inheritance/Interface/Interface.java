// package MultipleInheritance;

interface Car{
    public void start();
}

class ElectricCar implements Car{
    public void start(){      // Implimenting interface
        System.out.println("Electric Car Starts");
    }
}

class DieselCar implements Car{
    public void start(){         // Implimenting interface
        System.out.println("Diesel Car Starts");
    }
}
public class Interface {
    public static void main(String[] args) {
        Car Tesla = new ElectricCar();
        Car XUV700 = new DieselCar();

        Tesla.start();
        XUV700.start();
    }
}






// Interface  -> An interface is a set of abstract methods you would want your class to implement.
// These methods are public and abstract by default ( you don't have to explicitlyuse the "abstract" keyword),
//  and any class implementing your interface will need to provide implementations of those methods.

// Interface k andr method ko keval declare kiya jata h bosy nhi provide nhi ki jati, impliment nhi kiya jata


// Iterfaces are used to achieve abstraction and implement multiple inheritance.


// Intution behind using interface  -> Jrur impliment ho
//                                   PIZZA example -> we want all the steps to be followed for making a perfedct pizza
//                                                  > Make the dough
//                                                  > Proof the dough
//                                                  > Prepare the souce and topping
//                                                  > Shape the dough
//                                                  > Bake the pizza
//  if we put all of the above steps in an interface then it will be majburi to follow all the steps


//                                                    
// -> Abstract class ? Abstract Method ?

// -> Implements keyword -> To declare abd use an interface

// -> Object class ka bnta h interface ka nhi


// Some Points to remember ->

// -> An interface can be used when we want to achieve 100% abstraction.
//  On the other hand , abstract classes can be used to achieve anything between 0-100%.

// An interface cannot have constructors because we can not create objects of an interface.

// If you want a class to achieve multiple inheritance, there is only one way.

// if an interface is made private or if the methods in it are made private or protected 
// then a compilation error will be thrown.




// Advantages of interface ->

// Interface can be used to enforce a contract - that is, provide a specification that classes must impliment certain 
// methods if they want to use that inteface.

// Interface are used to achieve multiple inheritance

// Interfaces can be used to achieve loose coupling - with interfaces, we can ensure that changes in one class do not affect other classes.

// Loose coupling --> how much one component of a particular project is dependent on another component,, the more one component is dependent on other component the more bad project is.




// Disadvantages of interface ->

// Interfaces aexpose their member variables since they must be public.

// Since an interface can be thought of as a contract implemented by multiple 
// classes, in certain cases, modifying the interface could lead to unupredictable behaviour for the classes implmenting them.

