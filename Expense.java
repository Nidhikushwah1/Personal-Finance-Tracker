class Expense extends Transaction {

    public Expense(double amount, String category, String date) {

        super(amount, category, date);
    }

    @Override
    public void apply(Account account) {

        account.updateBalance(-amount);
    }
}