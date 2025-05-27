package Basics;
// package oops;
import java.util.*;

public class oops1 {
    String name;    // Attribute
    int roll_no;    // Attribute
    // Final keyword -> Ek baar jo value dal gyi vhi hmesa rhegi
    final String naam = "Shani";

    // for accessing attribute we create an object in main case and access attributes with the help of dot (.)

    

    // Method
    public void printdata() {
        System.out.println(name);
        System.out.println(roll_no);
    }

    public void printFinalKeywordData() {
        System.out.println(naam);
    }

    public static void main(String[] args) {
        oops1 std1 = new oops1();  // Object creation
        std1.name = "Alok";
        std1.roll_no = 15;
        System.out.println(std1.name);
        System.out.println(std1.roll_no);
        std1.printdata();  // called a method named as printdata in which above two line of code written 
        // koi object jab method ko call lgata hai to uss method k
        // functionalities ko achieve krta h 

        oops1 std2 = new oops1();
        std2.name = "Shubham";
        std2.roll_no = 16;
        std2.printdata();

        // we can change value of std2.name
        std2.name = "Shubbu";
        std2.printdata();

        // to avoid this value manipulation, there is final keyword

        // Final keyword -> Ek baar jo value dal gyi vhi hmesa rhegi

        System.out.println();
        std2.printFinalKeywordData();
        // std2.naam = "Upadhyay";
       //  System.out.println(std2.naam);  // Can not assign a value to final variable naam

        

    }
    
}

