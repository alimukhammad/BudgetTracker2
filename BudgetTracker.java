package BudgetTracker2;


public class BudgetTracker{

    private double income, expenses, balance;
    private double loanAmount, loanInterestRate, monthlyPayment;
    private int loanTermInMonths;
    
    public BudgetTracker(double initialBalance){
        balance = initialBalance;
    }

    public void addIncome(double amount) {
        income += amount;
        balance += amount;
    }

    public void addExpense(double amount){
        expenses += amount;
        balance -= amount;
    }

    public void addLoan(double amount, double interestRate, int termInMonths) {
        loanAmount = amount;
        loanInterestRate = interestRate;
        loanTermInMonths = termInMonths;

        // Calculate the monthly payment for the loan
        double monthlyInterestRate = loanInterestRate / 12;
        monthlyPayment = (loanAmount * monthlyInterestRate) /
            (1 - Math.pow(1 + monthlyInterestRate, -loanTermInMonths));
        expenses += monthlyPayment;
        balance -= monthlyPayment;
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

    public void generateReport() {
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + expenses);
        System.out.println("Balance: " + balance);
        if (loanAmount > 0) {
            System.out.println("Loan amount: " + loanAmount);
            System.out.println("Loan interest rate: " + loanInterestRate);
            System.out.println("Loan term (months): " + loanTermInMonths);
            System.out.println("Monthly loan payment: " + monthlyPayment);
        }
    }

}