import java.util.ArrayList;
class Account {

    private double balance; // Encapsulation
    private ArrayList<Transaction> transactions;

    public Account() {
        balance = 0.0;
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {

        if (t.getAmount() <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        t.apply(this);
        transactions.add(t);

        System.out.println("Transaction added successfully!");
    }

    public void updateBalance(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}