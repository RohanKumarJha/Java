class Mobile {
    private String model;
    private int price;
    private static String type;

    public Mobile() {
        this.model = "Apple";
        this.price = 1700;
        Mobile.type = "Phone";
    }

    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setType(String type) {
        Mobile.type = type;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        System.out.println(obj.getModel()+" : "+obj.getPrice()+" : "+obj.getType());
        obj.setModel("Samsung");
        obj.setPrice(1500);
        System.out.println(obj.getModel()+" : "+obj.getPrice()+" : "+obj.getType());
    }
}