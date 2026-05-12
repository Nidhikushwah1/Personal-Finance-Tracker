import java.util.Scanner;
public class PersonalFinanceTrackerFinal{

    public static void displayMenu() {

        System.out.println("\n===== Personal Finance Tracker =====");

        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. View Report");
        System.out.println("4. Exit");

        System.out.print("Enter choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        ReportGenerator report = new ReportGenerator();

        while (true) {

            displayMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
System.out.print("Enter income amount: ");
                    double incomeAmount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter category: ");
                    String incomeCategory = sc.nextLine();

                    System.out.print("Enter date (dd-mm-yyyy): ");
                    String incomeDate = sc.nextLine();

                    Income income = new Income(
                            incomeAmount,
                            incomeCategory,
                            incomeDate
                    );

                    account.addTransaction(income);

                    break;

                case 2:

                    System.out.print("Enter expense amount: ");
                    double expenseAmount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter category: ");
                    String expenseCategory = sc.nextLine();

                    System.out.print("Enter date (dd-mm-yyyy): ");
                    String expenseDate = sc.nextLine();

                    Expense expense = new Expense(
                            expenseAmount,
                            expenseCategory,
                            expenseDate
                    );

                    account.addTransaction(expense);

                    break;

                case 3:

                    report.generateReport(account);

                    break;

                case 4:

                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}