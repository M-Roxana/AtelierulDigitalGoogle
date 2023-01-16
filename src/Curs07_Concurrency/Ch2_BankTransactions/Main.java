package Curs07_Concurrency.Ch2_BankTransactions;

public class Main {
        public static void main(String[] args) {
                BankAccount account1 = new BankAccount("Account 1", 100);
                BankAccount account2 = new BankAccount("Account 2", 20);

                TransactionThread t1 = new TransactionThread("Transaction Thread 1", account1, account2, 10);
                TransactionThread t2 = new TransactionThread("Transaction Thread 2", account2, account1, 50);
                t1.start();
                t2.start();
        }
}
