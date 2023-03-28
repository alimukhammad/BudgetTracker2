package BudgetTracker2;

import java.util.Scanner;

public class BudgetTrackerUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your initial balance: ");
        double initialBalance = scanner.nextDouble();
        System.out.print("Enter your loan balance: ");
        double loanAmount = scanner.nextDouble();
        BudgetTracker budgetTracker = new BudgetTracker(initialBalance + loanAmount);

        while (true) {
            System.out.println("1. Add income");
            System.out.println("2. Add expense");
            System.out.println("3. Add loans");
            System.out.println("4. Generate report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount of income: ");
                    double income = scanner.nextDouble();
                    budgetTracker.addIncome(income);
                    break;
                case 2:
                    System.out.print("Enter the amount of expense: ");
                    double expense = scanner.nextDouble();
                    budgetTracker.addExpense(expense);
                    break;
                case 3:
                    System.out.print("Enter the amount of loans: ");
                    double loans = scanner.nextDouble();
                    budgetTracker.addLoan(loans);;
                    break;    
                case 4:
                    budgetTracker.generateReport();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
