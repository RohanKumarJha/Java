public class MultipleException {
    public static void main(String[] args) {
        int i=9;
        int[] arr = new int[5];
        String str = "Rohan";
        int j=0;
        try {
            j = 18/i;
            arr[1] = 5;
            // arr[5] = 6;
            int n = str.length();
        } catch(ArithmeticException e) {
            System.out.println("You can't divide the number by 0");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You can't access the element out of limit");
        } catch(NullPointerException e) {
            System.out.println("You can't access the length of null string");
        } catch(Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("Hi Everyone");
    }
}
