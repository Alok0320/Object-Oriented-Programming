// package MultilevelInheritance;

class A{
    void methodA(){
        System.out.println("Method of A class");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Method of B class");
    }
}

class C extends B{
    void methodC(){
        System.out.println("Method of C class");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodC();
        obj.methodB();
        obj.methodA();

        // We have access the methods of A,B,C class by only using object of C class.

        // Bottum-up approach
    }
}
