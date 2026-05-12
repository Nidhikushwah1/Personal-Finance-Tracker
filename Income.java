class Income extends Transaction {

    public Income(double amount, String category, String date) {
        super(amount, category, date);
    }

    @Override
    public void apply(Account account) {
        account.updateBalance(amount);
    }
}