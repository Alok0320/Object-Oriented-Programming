// package oops.ATM;
import java.util.*;


class ATM{

    float Balance;
    int PIN = 5674; 

    public void checkpin() {
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();
        if (enteredPIN == PIN) {
            menu();
        }
        else {
            System.out.println("Enter a valid PIN");
            menu();
        }}

        public void menu(){
            System.out.println("Enter your choice: ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);

            int option = sc.nextInt();

            if(option == 1) {
                checkBalance();
            }
            else if(option == 2) {
                withdrawMoney();
            }
            else if(option == 3) {
                depositMoney();
            }
            else if(option == 4) {
                return;
            }
            else {
                System.out.println("Enter a valid choice!");
            }
        }

        public void checkBalance() {
            System.out.println("Balance: " + Balance);
            menu();
        }

        public void withdrawMoney() {
            System.out.println("Enter Amount to Withdraw: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if(amount > Balance) {
                System.out.println("Insufficient Balance");
            }
            else {
                Balance -= amount;
                System.out.println("Money Withdrawl Successfully");
            }
            menu();
        }

        public void depositMoney(){
            System.out.println("Enter the Amount: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance += amount;
            System.out.println("Money Deposited Successfully");
            menu();
        }

        
    }

public class ATMMachine {

    
    public static void main(String[] args) {
        ATM obj = new ATM();

        obj.checkpin();
    }
}
