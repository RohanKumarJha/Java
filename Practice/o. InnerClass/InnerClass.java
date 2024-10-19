public class InnerClass {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.model = "Samsung";
        obj.price = 1700;
        obj.type = "SmartPhone";
        obj.show();

        obj.new TelePhone().dumb();        
    }
}