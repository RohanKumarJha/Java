public class Tester {
    public static void main(String[] args) {
        PlayerRating obj1 = new PlayerRating(1, "Beckham");
        obj1.calculateAverageRating((float)9.0,(float)9.9);
        obj1.calculateCategory();
        obj1.display();

        PlayerRating obj2 = new PlayerRating(1, "Oscar");
        obj2.calculateAverageRating((float)1, (float)1,(float)1);
        obj2.calculateCategory();
        obj2.display();
    }
}
