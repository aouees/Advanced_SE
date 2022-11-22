package Week10_2;

public class Main {
    public static void main(String[] args) {
        Mortgage mortgage = new Mortgage();
        // Evaluate mortgage eligibility for customer
        Customer customer = new Customer("Ann McKinsey");
        boolean eligible = mortgage.IsEligible(customer, 125000);
        System.out.println("\n" + customer.getName() +" has been " + (eligible ? "Approved" : "Rejected"));
    }
}
