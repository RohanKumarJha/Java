class Mobile {
    String model;
    int price;
    String type;

    public void show() {
        System.out.println(model+" : "+price+" : "+type);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.model = "Apple";
        obj1.price = 1700;
        obj1.type = "SmartPhone";
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.model = "Samsung";
        obj2.price = 1500;
        obj2.type = "SmartPhone";
        obj2.show();
    }    
}