//14.	Create the Account class Account.java and write a main method in a different class to briefly experiment with some instances of the Account class. Using the Account class as a base class, write two derived classes called SavingsAccount and CurrentAccount.A SavingsAccount object, in addition to the attributes of an Account object, should  have  an  interest  variable  and  a  method  which  adds  interest  to  the  account.  A CurrentAccount  object,  in addition to the  attributes of an Account object, should have  an overdraft limit variable. Ensure that you have overridden methods of the Account class as necessary in both derived classes.Now create a Bank class, an object of which contains an array of Account objects. Accounts in  the  array  could  be  instances  of  the  Account  class,  the  SavingsAccount  class,  or  the CurrentAccount class. Create some test accounts (some of each type).Write an update method in the bank class. It iterates through each account, updating it in the following ways: Savings accounts get interest added (via the method you already wrote); CurrentAccounts get a letter sent if they are in overdraft.The Bank class requires methods for opening and closing accounts, and for paying a dividend into each account. Hints:Note that the balance of an account mayonly be modified through the deposit(double) and withdraw(double) methods. 
//The Account class should not need to be modified at all. Be sure to test what you have done after each step.

import java.util.*;

class Account {
    String name;
    String branch;
    private double bal = 0;

    Account(String n , String br , int b){
        name = n;
        branch=br;
        bal = b;
    }

    public double getBalance(){
        return bal;
    }

    public void updateBalance(double b){
        System.out.println("For Customer , " + name + " \nUpdated balance is : " + b);
        bal=b;
    }
}

class SavingsAccount extends Account{
    static final int interest = 10;

    SavingsAccount(String n, String br, int b) {
        super(n, br, b);
    }

    public void addInterest(){
        double b = getBalance();
        updateBalance(b+b*interest/100);
    }

}

class CurrentAccount extends Account{
    static final int ODLIMIT = 10000;
    int w_amt = 0;
    CurrentAccount(String n, String br, int b , int withdrawal_amt) {
        super(n, br, b);
        w_amt = withdrawal_amt;
    }

    public void withdraw(){
        if(w_amt>ODLIMIT && w_amt>=getBalance()){
            System.out.println("aukaat me rahoooo");
        }else{
            updateBalance(getBalance() - w_amt);
        }
    }

}

class Bank {
    List<Object> accounts = new ArrayList<Object>();
    Bank(List<Object> arr){
        accounts.addAll(arr);
    }

    public void browse(){
        for(Object acc : accounts){
            if(acc instanceof SavingsAccount){
                ((SavingsAccount) acc).addInterest();
            }else{
                ((CurrentAccount) acc).withdraw();
            }
        }
    }
}

class Q14 {
    public static void main(String[] args) {
        CurrentAccount acc1 = new CurrentAccount("A", "x", 5000, 2000);
        SavingsAccount acc2 = new SavingsAccount("B", "y", 8000);
        List<Object> accounts = Arrays.asList(
        acc1 , acc2
        );
        Bank bk = new Bank(accounts);
        bk.browse();
    }

}