/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

/**
 *
 * @author anri
 */
public class Account2 {
    
    private double balance;
    private long accountNo;
    private int accountType;

    public Account2(double bal, long acc, int accType)
    {
        balance = bal;
        accountNo = acc;
        accountType = accType;
    }

    public double getBalance()
    {
        // returner det igen
        return balance;
    }


    //Precondition:
    // None
    //Postcondition:
    // If amount <= 15000, balance = balance-amount
    // If amount < 0 || redrawal > 15000, balance unchanged
    // If balance-amount < 0, balance unchanged
    //
    // Output: newBalance if amount is legal
    //         0 if amount is illegal
    public double withdraw(double amount)
    {
        double returnVal = 0;
        double newBalance = 0;

        if (amount <= 15000 && amount >= 0)
        {
          newBalance = balance - amount;
          if (newBalance >= 0)
          {
            returnVal = newBalance;
            balance = newBalance;
          }
        }
        return returnVal;
    }

    //Precondition:
    // adding >= 0
    //Postcondition:
    // If accountType == 1,             annualInterest calculated from interest+adding
    //                                  if interest+adding is more tha 10%, add 50% to fee
    //                                  balance is added annualInterest and subtracted fee
    //
    // If accountType == 2,             annualInterest calculated from interest
    //                                  balance is added annualInterest
    //
    // If accountType == 3,             annualInterest calculated from interest+adding
    //                                  balance is added annualInterest
    // Output: AnnualInterest
public double calculateAnnualInterest(double adding, double interest, double fee)
    {
        double annualInterest = 0;
            switch(accountType)
            {
                case 1:
                    // Salary Account
                    annualInterest = balance*(interest+adding);
                    if (interest+adding>0.1)
                        fee = fee*1.5;
                    balance = balance + annualInterest-fee;
                    break;
                case 2:
                    // Children Special
                    annualInterest = balance*interest;
                    balance = balance + annualInterest;
                    break;
                case 3:
                    // Business
                    annualInterest = balance*(interest+adding);
                    balance = balance - annualInterest;
                    break;
            }
        return annualInterest;
    }
}
