class Mobile {
    private String model;
    private int price;
    private String type;

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
        this.type = type;
    }

    public void show() {
        System.out.println(model+" : "+price+" : "+type);
    }
}
class UpdatePhone extends Mobile {
    @Override
    public void show() {
        System.out.println("Apple : 1700 : Phone");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Mobile obj = new UpdatePhone();
        obj.setModel("Samsung");
        obj.setPrice(1500);        
        obj.setType("SmartPhone");
        obj.show();
    }
}