class Car {
    String model;
    int price;
    String type;

    Car(String model,int price,String type) {
        this.model = model;
        this.price = price;
        this.type = type;
    }
}
class AdvCar extends Car {
    AdvCar() {
        super("Alto",1700,"Car");
    }
}
public class Super {
    public static void main(String[] args) {
        AdvCar obj = new AdvCar();
        System.out.println(obj.model+" : "+obj.price+" : "+obj.type);
    }
}