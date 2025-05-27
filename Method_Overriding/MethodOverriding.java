// package oops.Method_Overriding;

// talks about method body
// Generally get use in inheritance
  
class Bank{
    public void RateOfInterest(){
        System.err.println("Generally rate of interest is 5%");
    }
}

class SBI extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of Interest of SBI is 6.5%");
    }
}

class PNB extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of Interest of PNB is 7.5%");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.RateOfInterest();
        SBI obj1 = new SBI();
        obj1.RateOfInterest();
        PNB obj2 = new PNB();
        obj2.RateOfInterest();
    }
}
