import java.lang.reflect.Array;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Registration obj1 = new Registration("Kevin", "MN9891N", new long[]{9452425421l,7676765252l});
        System.out.println("Congratulations "+obj1.getCustomerName()+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("Passport number: "+obj1.getPassportNo());
        System.out.println("Phone numbers: "+Arrays.toString(obj1.getTelephoneNo()));

        Registration obj2 = new Registration("Julias", 123,"PN7878", new long[]{2345615451l,6763562562l});
        System.out.println("Congratulations "+obj2.getCustomerName()+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("License number: "+obj2.getLicenseNo());
        System.out.println("PanCard number: "+obj2.getPanCardNo());
        System.out.println("Phone numbers: "+Arrays.toString(obj2.getTelephoneNo()));

        Registration obj3 = new Registration("Jammy", 45453, 765, new long[]{9634524353l,9887373737l});
        System.out.println("Congratulations "+obj3.getCustomerName()+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("VoterId: "+obj3.getVoterId());
        System.out.println("License number: "+obj3.getLicenseNo());
        System.out.println("Phone numbers: "+Arrays.toString(obj3.getTelephoneNo()));

        Registration obj4 = new Registration("Rose", "PN8934", 34356, new long[]{9867456367l,7645367356l});
        System.out.println("Congratulations "+obj4.getCustomerName()+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("PanCard No: "+obj4.getPanCardNo());
        System.out.println("VoterId number: "+obj4.getVoterId());
        System.out.println("Phone numbers: "+Arrays.toString(obj4.getTelephoneNo()));
    }
}
