// package oops.AccessModifier;

// Types ->
//        Public, Private, Protected, Default


class DefaultClass {
    // default access modifier (no modifier)
    void defaultMethod() {
        System.out.println("Default method: accessible within the same package");
    }
}

public class AccessModifier {
    // public field
    public String publicField = "Public";

    // private field
    private String privateField = "Private";

    // protected field
    protected String protectedField = "Protected";

    // default field (no access modifier)
    String defaultField = "Default";

    // public method
    public void publicMethod() {
        System.out.println("Public method: accessible everywhere");
    }

    // private method
    private void privateMethod() {
        System.out.println("Private method: accessible only within this class");
    }

    // protected method
    protected void protectedMethod() {
        System.out.println("Protected method: accessible within package and subclass");
    }

    // default method (no access modifier)
    void defaultMethod() {
        System.out.println("Default method: accessible within package");
    }

    public void testAccess() {
        // Accessing all methods within the same class
        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }

    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();
        obj.testAccess();

        DefaultClass def = new DefaultClass();
        def.defaultMethod();  // accessible because it's in the same package
    }
}
