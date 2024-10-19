public class ChocolateTester {
    public static void main(String[] args) {
        Chocolate obj = new Chocolate(101,"Cadbury",12,10);
        System.out.println(obj.getBarCode()+" "+obj.getName()+" "+obj.getWeight()+" "+obj.getCost());
        obj.setBarCode(102);
        obj.setName("Hershey's");
        obj.setWeight(24);
        obj.setCost(50);
        System.out.println(obj.getBarCode()+" "+obj.getName()+" "+obj.getWeight()+" "+obj.getCost());
    }
}
