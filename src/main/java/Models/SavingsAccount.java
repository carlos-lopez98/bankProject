package Models;

public class SavingsAccount {
    public int balance = 0;

    SavingsAccount(){
    }
    // Checks if there are sufficient funds then withdraws balance
    public void withdraw(int amount){
        if(!(amount < balance)){
            balance -= amount;
            System.out.println("$" + amount + " has been withdraws from Savings Account");
        }else{
            System.out.println(balance);
            System.out.println("Insufficient funds for withdraw amount");
        }
    }
    // adds deposit to balance
    public void deposit(int amount){
        balance += amount;
        System.out.println("$" + amount + " was added to Savings Account");
    }
}
