// package oops.Super_Keyword;

// 2. TO INVOKE PARENT CLASS METHOD

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eating Bread...");
    }
    void bark(){
        System.err.println("Barking...");
    }
    void work(){
        super.eat();  // will impliment eat method of Animal Super class
        bark();
    }
}
public class Super2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
