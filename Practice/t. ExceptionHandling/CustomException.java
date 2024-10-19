class RohanException extends Exception {
    RohanException(String str) {
        System.out.println("Wrong Exception");
    }
}
public class CustomException {
    public static void main(String[] args) {
        int a=0;
        int b =0;
        try {
            b = 18/a;
            if(b==0) {
                throw new RohanException("This exception is mine");
            }
        } catch(RohanException e) {
            b = 18;
            System.out.println("This is the default value : "+b);
        }
        System.out.println(b);
        System.out.println("Bye");
    }
}