package Curs07_Concurrency.Ch2_BankTransactions;

public class BankAccount {

    private String name;
    private int debit;

    public BankAccount(String name, int debit){
        this.name = name;
        this.debit = debit;
    }

    public void  withdraw(double amount){
        longDatabaseCall();
        if(debit >= amount){
            debit -= amount;
            System.out.println(debit);
        } else {
            System.out.println("Insufficient debit");
        }
    }

    public void deposit(double amount){
        longDatabaseCall();
        debit += amount;
    }

    public void longDatabaseCall(){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
