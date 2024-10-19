class Mobile {
    String model;
    int price;
    static String type;

    static {
        type = "SmartPhone";
    }

    public void show() {
        System.out.println(model+" : "+price+" : "+type);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.model = "Samsung";
        obj.price = 1700;

        obj.show();
    }
}
