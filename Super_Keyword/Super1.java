// package oops.Super_Keyword;

// 1. To INVOKE PARENT CLASS VARIABLE

class Animal {
    String color = "White";
}

class Dog extends Animal{
    String color = "black";
    void printcolor(){
        System.out.println(color);  // prints color of Dog class
        System.out.println(super.color);  // prints color of Animal class
    }
}
public class Super1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printcolor();
    }
}
