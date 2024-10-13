public class Phone {
    String model;
    int price;
    String type;

    public void show() {
        System.out.println(model+" : "+price+" : "+type);
    }

    class TelePhone {
        public void dumb() {
            System.out.println("This Phone is dumb like me...");
        }
    }
}
