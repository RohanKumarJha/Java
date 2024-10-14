// input
// charAt(),length(),indexOf() and lastIndexOf()
// compareTo()
// contains()
// startsWith(), endsWith(), toLowerCase(), toUpperCase()
// concat()
// split(" ")

public class StrinG {
    public static void main(String[] args) {
        String str = "Rohan Kumar Jha";
        for(int i=0; i<str.length(); i++) {     // length()
            System.out.print(str.charAt(i)+" ");     // charAt()
        }
        System.out.println(str.indexOf('a'));   // indexOf('')
        System.out.println(str.lastIndexOf('a'));   // lastIndexOf('')
        String str2 = "Rishabh Kumar Jha";
        System.out.println(str.compareTo(str2));    // compareTo()
        System.out.println(str2.contains("Jha"));   // contains()
        System.out.println(str.startsWith("Rohan"));    // startsWith()
        System.out.println(str.endsWith("Rohan"));
        System.out.println(str.toUpperCase());  // toUpperCase()
        System.out.println(str.toLowerCase());  // toLowerCase()
        System.out.println(str+"KUMAR JHA");     // concat(+)
        System.out.println(str.concat(str2));  // concat()
        String[] arr = str.split(" ");  // split(" ")
        for(String result : arr) {
            System.out.println(result);
        }
    }
}