package oops1java;
import java.util.*;

 class ATM {
    
    float Balance;
    int PIN = 3010;

    public void checkpin(){
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
            menu();

        }else{
            System.out.println("Enetr valid pin!!");
            checkpin();
        }
    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. check A/C balance");
        System.out.println("2. withdraw money");
        System.out.println("3. deposit money");
        System.out.println("4. exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt ==1){
            checkbalance();
        }
        else if(opt == 2){
            withdrawmoney();
        }
        else if(opt == 3){
            depositmoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }

    public void checkbalance(){
            System.out.println("Balance = "+ Balance);
            menu();
    }

    public void withdrawmoney(){
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount>Balance){
              System.out.println("Insufficient money!");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successfull!");

        }
        menu();
    }

    public void depositmoney(){
        System.out.println("Enter amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("money deposited successfully!");
        menu();
    }

}

 public class ATMMACHINE{
      public static void main(String[] args) {
        
        ATM obj = new ATM();
        obj.checkpin();
      }
 }
