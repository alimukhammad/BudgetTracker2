package BudgetTracker2;


public class BudgetTracker{

    private double income, expenses, balance, loans;
    
    public BudgetTracker(double initialBalance){
        balance = initialBalance;
    }

    public void addLoan(double amount) {
        loans = -loans - amount;
        balance += amount;
    }

    public void addIncome(double amount) {
        income += amount;
        balance += amount;
    }

    public void addExpense(double amount){
        expenses += amount;
        balance -= amount;
    }

    public double getIncome() {
        return income;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getBalance() {
        return balance;
    }

    public double getLoans() {
        return loans;
    }

    public void generateReport() {
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + expenses);
        System.out.println("Balance: " + balance);
        System.out.println("Loans: " + loans);
    }

}