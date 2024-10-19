package customer;
public class PremiumUser extends User {
    private int rewardPoints;

    public PremiumUser(int id,String userName,String emailId,double walletBalance) {
        super(id,userName,emailId,walletBalance);
    }

    public boolean makePayment(double billAmount) {
        if(getWalletBalance() >= billAmount) {
            setWalletBalance(getWalletBalance()-billAmount);
            this.rewardPoints = (int)billAmount/10;
            return true;
        } return false;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
