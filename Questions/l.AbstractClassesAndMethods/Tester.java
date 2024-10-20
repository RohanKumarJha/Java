import payment.CreditCardPayment;
import payment.ShoppingPayment;

public class Tester {
    public static void main(String[] args) {
        CreditCardPayment obj1 = new CreditCardPayment(10000.23,5001);
        obj1.payBill(15000.0);

        CreditCardPayment obj2 = new CreditCardPayment(10000.23,5001);
        obj2.payBill(0.0);

        ShoppingPayment obj3 = new ShoppingPayment(10000.23,5001);
        obj3.payBill(5000.0);

        ShoppingPayment obj4 = new ShoppingPayment(5000.0,561328);
        obj4.payBill(5000.0);

        ShoppingPayment obj5 = new ShoppingPayment(5000.0,5004);
        obj5.payBill(6000.0);
    }
}
