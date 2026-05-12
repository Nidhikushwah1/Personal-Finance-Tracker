import java.util.Scanner;

public class PersonalFinanceTracker{

    public static void displayMenu() {

        System.out.println("\n");
        System.out.println("                MAIN MENU");
        System.out.println("==============================================");

        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. View Monthly Report");
        System.out.println("4. View Transaction History");
        System.out.println("5. Check Current Balance");
        System.out.println("6. Exit");

        System.out.println("==============================================");

        System.out.print("\nEnter choice : ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("        PERSONAL FINANCE TRACKER");
        System.out.println("==============================================");

        System.out.print("\nEnter your name : ");
        String userName = sc.nextLine();

        System.out.print("\nEnter Initial Balance : ");
        double openingBalance = sc.nextDouble();

        Account account =
                new Account(userName, openingBalance);

        ReportGenerator report =
                new ReportGenerator();

        System.out.println("\nAccount Created For : "
                + userName
                + " | Opening Balance : "
                + openingBalance);

        while (true) {

            displayMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n==============================================");
                    System.out.println("                ADD INCOME");
                    System.out.println("==============================================");

                    System.out.print("\nEnter Income Amount : ");
                    double incomeAmount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category      : ");
                    String incomeCategory = sc.nextLine();

                    System.out.print("Enter Date          : ");
                    String incomeDate = sc.nextLine();

                    Income income =
                            new Income(
                                    incomeAmount,
                                    incomeCategory,
                                    incomeDate
                            );

                    account.addTransaction(income);

                    break;

                case 2:

                    System.out.println("\n==============================================");
                    System.out.println("                ADD EXPENSE");
                    System.out.println("==============================================");

                    System.out.print("\nEnter Expense Amount : ");
                    double expenseAmount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category        : ");
                    String expenseCategory = sc.nextLine();

                    System.out.print("Enter Date            : ");
                    String expenseDate = sc.nextLine();

                    Expense expense =
                            new Expense(
                                    expenseAmount,
                                    expenseCategory,
                                    expenseDate
                            );

                    account.addTransaction(expense);

                    break;

                case 3:

                    report.generateMonthlyReport(account);

                    break;

                case 4:

                    report.showTransactionHistory(account);

                    break;

                case 5:

                    System.out.println("\n==============================================");
                    System.out.println("              CURRENT BALANCE");
                    System.out.println("==============================================");

                    System.out.println("\nAccount Holder : "
                            + account.getUserName());

                    System.out.println("\nAvailable Balance : Rs. "
                            + account.getBalance());

                    System.out.println("\n==============================================");

                    break;

                case 6:

                    System.out.println("\n==============================================");
                    System.out.println("     THANK YOU FOR USING PERSONAL FINANCE TRACKER: ");
                    System.out.println("==============================================");

                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("\nInvalid Choice!");
            }
        }
    }
}