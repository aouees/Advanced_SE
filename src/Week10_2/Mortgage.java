package Week10_2;

public class Mortgage {
    Bank bank = new Bank();
    Loan loan = new Loan();
    Credit credit = new Credit();
    public boolean IsEligible(Customer cust, int amount) {
        System.out.println(cust.getName() + " applies for " + amount + " loan\n");
        boolean eligible = true;
        // Check creditworthyness of applicant
        if (!bank.HasSufficientSavings(cust, amount))
        {
            eligible = false;
        }
        else if (!loan.HasNoBadLoans(cust))
        {
            eligible = false;
        }
        else if (!credit.HasGoodCredit(cust))
        {
            eligible = false;
        }
        return eligible;
    }
}

