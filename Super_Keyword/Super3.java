// package oops.Super_Keyword;


// 3. TO INVOKE PARENT CLASS CONSTRUCTOR

class Animal{
    Animal(){
        System.out.println("animal is created");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("dog is created");
    }
}
public class Super3 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
