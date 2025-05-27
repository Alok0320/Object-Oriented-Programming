package oops.Inheritance.Hierarchical_Inheritance;
// package oops.Hierarchical_Inheritance;

// 1 parent , multiple child
// opposite of multiple inheritance

class A{
    public void print(){
        System.out.println("Class A method");
    }
}

class B extends A{
    public void printB(){
        System.out.println("class B method");
    }
}

class C extends A{
    public void printC(){
        System.out.println("class C method");
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C();
        obj.print();
        obj1.print();
    }
}


// Hierarchical inheritance is a type of inheritance in object-oriented programming where multiple subclasses inherit from a single base (parent) class.

// ---

// ### ✅ **Advantages of Hierarchical Inheritance**

// 1. **Code Reusability**
//    Common functionality defined in the base class can be reused in all derived classes, reducing code duplication.

// 2. **Logical Structure**
//    It mirrors real-world relationships well, helping developers logically organize and manage classes.

// 3. **Scalability**
//    You can add more subclasses without modifying the base class, making the system easily extensible.

// 4. **Consistency**
//    All child classes inherit consistent behavior from the same parent class, ensuring uniformity.

// 5. **Reduced Redundancy**
//    Shared methods and properties are written only once in the base class, making the codebase cleaner.

// ---

// ### ❌ **Disadvantages of Hierarchical Inheritance**

// 1. **Tight Coupling**
//    All subclasses depend on the base class. Changes in the base class might affect all derived classes.

// 2. **Complex Debugging**
//    Errors in the parent class can propagate to all child classes, making debugging more challenging.

// 3. **Limited Flexibility**
//    A child class is bound to the structure of the parent class, which might limit customization.

// 4. **Overhead in Understanding**
//    For larger projects with many subclasses, understanding the hierarchy and flow of control can be confusing for new developers.

// 5. **Inheritance Misuse**
//    Developers might be tempted to inherit unnecessarily just to reuse code, violating proper object-oriented design principles (e.g., composition over inheritance).

// ---

