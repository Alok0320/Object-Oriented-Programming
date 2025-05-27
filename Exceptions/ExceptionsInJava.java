package Exceptions;
public class ExceptionsInJava {
    public static void main(String[] args) {

        /*  What is Exceptional Handling ?
                        Ensuring the code doesn't break in the case of exceptions

       1.Exception      2.error
             
         Handle           H/D Crash
                          Power off
                          Memory Full
        */

        System.out.println("First Line");

        try{
            int num = 5/0;  // Handle the Exception     [ If we do not handle exception here the upcoming lines will not be executed ]
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Second Line");

        System.out.println("Third Line");

    }
}

// Final vs Finally vs Finalize
// throw vs throws
