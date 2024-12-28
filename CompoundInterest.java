package compoundinterest;

import javax.swing.JOptionPane;

public class CompoundInterest {
    
    // Declare variables at the top
    static String monthlySavingsStr;
    static double monthlySavings;
    static String annualInterestRateStr;
    static double annualInterestRate;
    static double monthlyInterestRate;
    static double balance;
    static int month;

    public static void main(String[] args) {
        // Prompt the user to enter monthly savings amount
        monthlySavingsStr = JOptionPane.showInputDialog("Enter the monthly savings amount:");
        monthlySavings = Double.parseDouble(monthlySavingsStr); 

        // Prompt the user to enter the annual interest rate
        annualInterestRateStr = JOptionPane.showInputDialog("Enter the annual interest rate (e.g., 5 for 5%):");
        annualInterestRate = Double.parseDouble(annualInterestRateStr);  
        monthlyInterestRate = annualInterestRate / 100 / 12; 

        //The account balance
        balance = 0;

        // Calculate the account value after each month up to 6 months
        for (month = 1; month <= 6; month++) {
            balance = (balance + monthlySavings) * (1 + monthlyInterestRate);
        }

        // Display the value after the 6th month
        JOptionPane.showMessageDialog(null, String.format("The value of the account after 6 months is: $%.2f", balance));
    }
}
