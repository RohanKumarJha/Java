class Mobile {
    String model;
    int price;
    static String type;

    public void show() {
        System.out.println(model+" : "+price+" : "+type);
    }
}
public class StaticVar {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.model = "Samsung";
        obj.price = 1700;
        obj.type = "SmartPhone";

        Mobile obj1 = new Mobile();
        obj1.model = "Apple";
        obj1.price = 1500;
        obj1.type = "SmartPhone";

        obj.show();
        obj1.show();

        Mobile.type = "Phone";
        
        obj.show();
        obj1.show();
    }
}