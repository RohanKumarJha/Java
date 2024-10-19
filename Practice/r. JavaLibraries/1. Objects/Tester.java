public class Tester {
    public static void main(String[] args) {
        Employee obj1 = new Employee(1,"Rohan");
        Employee obj2 = new Employee(2, "Rishabh");
        Employee obj3 = new Employee(3, "Mummy");

        System.out.println(obj1);
        System.out.println(obj1.hashCode());
        System.out.println(obj1.equals(obj3));
    }
}
