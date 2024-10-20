package payment;

public class ShoppingPayment extends RRPaymentServices {
    private static int counter=1000;
    private String paymentId;

    public ShoppingPayment(double balance,int customerId) {
        super(balance, customerId);
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void payBill(double amount) {
        if(getBalance()>amount) {
            System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+". Payment details are:");
            System.out.println("**********************************************************************************");
            System.out.println("Customer ID : "+getCustomerId());
            System.out.println("Payment ID : S"+(++counter));
            System.out.println("Previous Due: Rs."+getBalance());
            System.out.println("Remaining Due: Rs."+(getBalance()-amount));
        } else if(getBalance()==amount) {
            System.out.println("Congratulations!! Your payment of Rs."+amount+" is successful with payment id S"+(++counter));
        } else {
            System.out.println("Excess amount entered!! Please try again.");
        }
    }
}
