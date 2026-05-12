abstract class Transaction {

    protected double amount;
    protected String category;
    protected String date;

    public Transaction(double amount, String category, String date) {

        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public abstract void apply(Account account);

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }
}