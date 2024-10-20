package payment;
public class CreditCardPayment extends RRPaymentServices {
    private static int counter=1000;
    private String paymentId;
    private double cashBack;
    private double balanceDue;

    public CreditCardPayment(double balance,int customerId) {
        super(balance, customerId);
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    public void payBill(double amount) {
        if(amount>=getBalance()) {
            System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+". Payment details are:");
            System.out.println("**********************************************************************************");
            System.out.println("Customer ID : 5001");
            System.out.println("Payment ID : C"+(++counter));
            System.out.println("Previous Due: Rs."+getBalance());
            System.out.println("Remaining Due: Rs.0");
            System.out.println("Cashback wallet Balance : Rs."+(amount-getBalance()));
        } else {
            System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+". Payment details are:");
            System.out.println("**********************************************************************************");
            System.out.println("Customer ID : 5001");
            System.out.println("Payment ID : C"+(++counter));
            System.out.println("Previous Due: Rs."+getBalance());
            System.out.println("Remaining Due: Rs."+(getBalance()-amount));
            System.out.println("Cashback wallet Balance : Rs.0");
        }
    }
}
