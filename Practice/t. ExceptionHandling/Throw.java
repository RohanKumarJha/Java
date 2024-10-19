import java.io.EOFException;

public class Throw {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
            j=18/i;
            if(j==0) {
                throw new Exception();
            }
        } catch(Exception e) {
            j=18;
            System.out.println("You print the default value");
            System.out.println(j);
        }
        System.out.println("Bye");
    }
}
