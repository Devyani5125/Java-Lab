// Experiment 3:
// 1)write a program to create a class known as bank account with methods called deposit 
// and witdraw and create a child class known as saving account that overrides
// the withdraw method to prevent withdrawal if the account balance falls below one hundrd
import java.util.*;

class bankaccount{
    double balance;

    bankaccount(double balance){
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount){
        if(balance - amount < 100){
            System.out.println("Withdrawal denied. Balance cannot fall below 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    } 

}
