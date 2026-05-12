import java.util.ArrayList;

class Account {

    private String userName;
    private double balance;
    private double openingBalance;

    private ArrayList<Transaction> transactions;

    public Account(String userName, double openingBalance) {

        this.userName = userName;
        this.openingBalance = openingBalance;

        this.balance = openingBalance;

        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {

        if (t.getAmount() <= 0) {

            System.out.println("Invalid Amount!");
            return;
        }

        t.apply(this);

        transactions.add(t);

        if (t instanceof Income) {

            System.out.println("\nIncome Added Successfully!");

        } else {

            System.out.println("\nExpense Added Successfully!");
        }

        System.out.println("\nCurrent Balance : Rs. " + balance);
    }

    public void updateBalance(double amount) {

        balance += amount;
    }

    public double getBalance() {

        return balance;
    }

    public double getOpeningBalance() {

        return openingBalance;
    }

    public String getUserName() {

        return userName;
    }

    public ArrayList<Transaction> getTransactions() {

        return transactions;
    }
}