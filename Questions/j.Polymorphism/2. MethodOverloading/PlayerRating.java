public class PlayerRating {
    int playerPosition;
    String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    float averageRating;
    char category;

    PlayerRating(int playerPosition,String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    public void calculateAverageRating(float criticOneRating,float criticTwoRating) {
        this.averageRating = (criticOneRating+criticTwoRating)/2;
    }
    public void calculateAverageRating(float criticOneRating,float criticTwoRating,float criticThreeRating) {
        this.averageRating = (criticOneRating+criticTwoRating+criticThreeRating)/3;
    }

    public void calculateCategory() {
        if(averageRating>8) {
            this.category = 'A';
        } else if(averageRating<=8 && averageRating>5) {
            this.category = 'B';
        } else if(averageRating<=5 && averageRating>0) {
            this.category = 'C';
        }
    }

    public void display() {
        System.out.println("The player name is "+playerName);
        System.out.println("The player position is "+playerPosition);
        System.out.println("The average rating is "+averageRating);
        System.out.println("The category is "+this.category);
    }
}