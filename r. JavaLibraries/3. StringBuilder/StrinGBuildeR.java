// setCharAt() append(ch/Str/Int)
// insert() deleteCharAt()
// reverse() delete(i,j)
// charAt()
// indexOf() lastIndexOf()
// substring()
public class StrinGBuildeR {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Rohan Kumar");
        System.out.println(str);
        str.setCharAt(5, 'J');
        System.out.println(str);
        str.insert(3, 'Z');
        System.out.println(str);
        str.deleteCharAt(4);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(3, 11);
        System.out.println(str);
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("ra"));
        System.out.println(str.lastIndexOf("ra"));
    }
}