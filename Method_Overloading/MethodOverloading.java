// package oops.Method_Overloading;

// Talks about method declaration
// 1. Same name of method, different number of arguments
// 2. Same name of method, same number of arguments, but different data types

public class MethodOverloading {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){  // Same name of method, different number of arguments
        return a+b+c;
    }

    public static String sum(String x, String y){  // same name of method, same number of arguments, but different data types
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,7));
        System.out.println(sum(5,7,8));
        System.out.println(sum("Indian","Programmer"));
    }
}
