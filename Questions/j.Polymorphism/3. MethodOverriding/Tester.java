import customer.*;
public class Tester {
    public static void main(String[] args) {
        int UserBillAmount = 70;
        User obj1 = new User(101,"Joe","joe@abc.com",100);
        if(obj1.makePayment(UserBillAmount)) {
            System.out.println("Congratulations "+obj1.getUserName()+", payment of $"+UserBillAmount+" was successful!");
            System.out.println("Your wallet balance is $"+obj1.getWalletBalance());
        } else {
            System.out.println("Sorry "+obj1.getUserName()+", you do not have enough balance to pay the bill!");
        }

        int premiumUserBillAmount = 150;
        PremiumUser obj2 = new PremiumUser(201,"Jill","joe@abc.com",300);
        if(obj2.makePayment(premiumUserBillAmount)) {
            System.out.println("Congratulations "+obj2.getUserName()+", payment of $"+premiumUserBillAmount+" was successful!");
            System.out.println("Your wallet balance is $"+obj2.getWalletBalance());
            System.out.println("You have "+obj2.getRewardPoints()+" points!");
        } else {
            System.out.println("Sorry "+obj2.getUserName()+", you do not have enough balance to pay the bill!");
        }
    }
}
