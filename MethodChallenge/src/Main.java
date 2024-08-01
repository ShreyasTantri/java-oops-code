public class Main {
    public static void main(String[] args) {
//
//        int score = 1500;
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jim", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Subrahmanyan", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Rajendra", playerPosition);

        playerPosition = calculateHighScorePosition(25);
        displayHighScorePosition("Rahul", playerPosition);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int score){
        if(score>=1000)
            return 1;
        else if (score>=500 && score<1000)
            return 2;
         else if (score>=100 && score<500)
            return 3;
         else
             return 4;
    }
}
