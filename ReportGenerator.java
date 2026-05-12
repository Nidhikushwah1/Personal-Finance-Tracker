class ReportGenerator {

    public void generateReport(Account account) {

        double incomeTotal = 0;
        double expenseTotal = 0;

        for (Transaction t : account.getTransactions()) {

            if (t instanceof Income) {
                incomeTotal += t.getAmount();
            }

            else if (t instanceof Expense) {
                expenseTotal += t.getAmount();
            }
        }

        System.out.println("\n===== Monthly Report =====");

        System.out.println("Total Income : ₹ " + incomeTotal);
        System.out.println("Total Expense: ₹ " + expenseTotal);
        System.out.println("Net Savings  : ₹ " + account.getBalance());

        System.out.println("\n--- Transaction Details ---");

        for (Transaction t : account.getTransactions()) {

            System.out.println(
                    t.getDate() + " | " +
                    t.getCategory() + " | ₹" +
                    t.getAmount() + " | " +
                    t.getClass().getSimpleName()
            );
        }
    }
}