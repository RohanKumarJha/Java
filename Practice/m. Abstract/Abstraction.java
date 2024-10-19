public class Abstraction {
    public static void main(String[] args) {
        Phone obj = new Iphone();
        obj.model = "Samsung";
        obj.price = 1700;
        obj.type = "SmartPhone";
        obj.show();
    }
}