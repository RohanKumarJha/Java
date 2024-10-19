public class LoanTester {
    public static void main(String[] args) {
        Loan obj1 = new Loan();
        System.out.println(obj1.getLoanCounter());
        Loan obj2 = new Loan();
        System.out.println(obj2.getLoanCounter());

        Loan obj3 = new Loan(0, 0, 0, 0, 0);
        System.out.println(obj3.getLoanCounter());
        Loan obj4 = new Loan(0, 0, 0, 0, 0);
        System.out.println(obj4.getLoanCounter());
    }
}
