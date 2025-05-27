//  package MultipleInheritance;

// Multiple iniheritance is not directly possible in java (ambiguity problem OR Diamond problem), 
// we can achieve Multiple Inheritance by using INTERFACE


interface A{
    public void run();
}

interface B{
    public void run();
}

class C implements A,B{
    public void run(){     // Implimenting interface
        System.out.println("C class run method");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.run();
    }
}
