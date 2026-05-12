class ReportGenerator {

    public void generateMonthlyReport(Account account) {

        double incomeTotal = 0;
        double expenseTotal = 0;

        for (Transaction t : account.getTransactions()) {

            if (t instanceof Income) {

                incomeTotal += t.getAmount();

            } else if (t instanceof Expense) {

                expenseTotal += t.getAmount();
            }
        }

        double savings = incomeTotal - expenseTotal;

        System.out.println("\n==============================================");
        System.out.println("              MONTHLY REPORT");
        System.out.println("==============================================");

        System.out.println("\nTotal Income   : Rs. " + incomeTotal);
        System.out.println("Total Expense  : Rs. " + expenseTotal);
        System.out.println("Net Savings    : Rs. " + savings);
        System.out.println("Current Balance: Rs. " + account.getBalance());

        if (savings > 0) {

            System.out.println("\nFinancial Status :  You are saving money!");

        } else {

            System.out.println("\nFinancial Status : ⚠ Expenses are high!");
        }

        System.out.println("\n==============================================");
    }

    public void showTransactionHistory(Account account) {

        System.out.println("\n==============================================");
        System.out.println("           TRANSACTION HISTORY");
        System.out.println("==============================================");

        System.out.printf("%-15s %-15s %-12s %-10s\n",
                "DATE",
                "CATEGORY",
                "AMOUNT",
                "TYPE");

        System.out.println("------------------------------------------------");

        for (Transaction t : account.getTransactions()) {

            System.out.printf("%-15s %-15s Rs.%-10.2f %-10s\n",
                    t.getDate(),
                    t.getCategory(),
                    t.getAmount(),
                    t.getClass().getSimpleName());
        }

        System.out.println("\n------------------------------------------------");

        System.out.println("Total Transactions : "
                + account.getTransactions().size());

        System.out.println("------------------------------------------------");
    }
}