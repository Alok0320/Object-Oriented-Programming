class Students{
    int id;
    int age;

    // Creating a constructor

    // Types of constructor  -> Default constructor, Parameterized constructor

    // Paramterized constructor

    Students(int id , int age){
        this.id = id;
        this.age = age;
        System.out.println("Parameterized constructor");
    }

    Students(){
        System.out.println("Default constructor");
    }
}


public class Constructor { 
    public static void main(String[] args) {
        Students obj = new Students(5, 19 );

        // Default constructor
         Students obj1 = new Students();
        
    }
}
 
// Use case = Certain piece of code object created hote hi run ho jaye ,, Koi new coustomer aata h turnt login show ho jata h 

// Jitne parameter wala method hoga utne argument dekr usko call kr skte h 