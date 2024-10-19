class Mobile {
    private String model;
    private int price;
    private static String type;

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

public class Encapsulation {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        System.out.println(obj.getModel()+" : "+obj.getPrice()+" : "+obj.getType());
        obj.setModel("Samsung");
        obj.setPrice(1500);
        obj.setType("SmartPhone");
        System.out.println(obj.getModel()+" : "+obj.getPrice()+" : "+obj.getType());
    }
}