class Mobile {
    private String model;
    private int price;
    private String type;

    Mobile(String model,int price,String type) {
        this.model = model;
        this.price = price;
        this.type = type;
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
}

public class ParametrizeConstructor {
    public static void main(String[] args) {
        Mobile obj = new Mobile("Samsung",1500,"Phone");
        System.out.println(obj.getModel()+" : "+obj.getPrice()+" : "+obj.getType());
        
    }
}
