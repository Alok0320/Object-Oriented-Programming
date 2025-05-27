package SingleInheritance;
//package Inheritance;

class Employee{
    void salary(){
        System.out.println("Salary = 70000");
    }
}

class Hr extends Employee{
    void Bonus(){
        System.out.println("Bonus = 20000");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Hr obj = new Hr();
        obj.salary();
        System.out.println();
        obj.Bonus();
    }
}



// Single Inheritance ->
//                     Simplest type of inheritance
//                     Just one parent class and one child class
//                     Easy to understand            
