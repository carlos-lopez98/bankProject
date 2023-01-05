package Models;

public class CheckingAccount {
    public int balance = 0;

    CheckingAccount(){

    }

    // Checks if there are sufficient funds then withdraws balance
    public void withdraw(int amount){
        if(!(amount < balance)){
            balance -= amount;
            System.out.println("$" + amount + " has been withdraws from Checking Account");
        }else{
            System.out.println(balance);
            System.out.println("Insufficient funds for withdraw amount");
        }
    }

    // adds deposit to balance
    public void deposit(int amount){
        balance += amount;
        System.out.println("$" + amount + " was added to Checking Account");
    }

    // returns balance
    public int viewBalance(){
        return balance;
    }
}
