public class Customer {
    int build;
    int customerId;
    int discount;
    double billAmount;
    double discountedBillAmount;

    public void show() {
        discountedBillAmount = (float)((float)billAmount - (float)billAmount * (float)(discount/100));
        System.out.println(discountedBillAmount);
    }
}