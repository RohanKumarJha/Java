class Mobile {
    String model;
    int price;
    String type;

    public void show(String model,int price) {
        System.out.println(model+" : "+price);
    }

    public void show(String model,int price,String type) {
        System.out.println(model+" : "+price+" : "+type);
    }
}