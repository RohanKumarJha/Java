class Mobile {
    String model;
    int price;
    static String type;

    public static void show(Mobile obj) {
        System.out.println(obj.model+" : "+obj.price+" : "+type);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.model = "Samsung";
        obj.price = 1500;

        Mobile.type = "SmartPhone";
        Mobile.show(obj);
    }
}
