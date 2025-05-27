// package oops.Polymorphism;

// Polymorphism -> Multiple forms
// achieve through method overloading and method overriding

// Types ->
//         1. Compile-time Polymorphism  -> Method Overloading  -> Checked at compiletime  -> Static binding  -> Early binding -> name of function, no. of args, datatyes get checked at compile time  -> faster  -> Less Flexibility -> Inheritance not involved
//         2. Run-time Polymorphism  -> Method Overriding  -> Checked at runtime -> Dynamic binding -> Late binding -> Implementation of function get checked at runtime  -> Slower  -> More Flexibility  -> Inheritance involved (Otherwise ambiguity situtaion will be arised)


class OverloadingDemo{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void sum(String a, String b){
        System.out.println(a+b);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.sum(5,7);
        obj.sum(5,7,8);
        obj.sum("Alok" ,"Upadhyay");
    }
}
