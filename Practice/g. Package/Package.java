import fourWheeler.*;

public class Package {
    public static void main(String[] args) {
        Car obj = new AdvCar();
        obj.model = "Baleno";
        obj.price = 1700;
        obj.type = "NormalCar";
        obj.show();
    }
}