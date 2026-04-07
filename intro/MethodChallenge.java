public class MethodChallenge {
    public static void main(String[] args) {
        int score1 = 1500;
        int score2 = 1000;
        int score3 = 500;
        int score4 = 100;
        int score5 = 25;

        String playerName = "ziad";
        int myScorePosition1 = calculateHighScorePosition(score1);
        int myScorePosition2 = calculateHighScorePosition(score2);
        int myScorePosition3 = calculateHighScorePosition(score3);
        int myScorePosition4 = calculateHighScorePosition(score4);
        int myScorePosition5 = calculateHighScorePosition(score5);

        displayHighScorePosition(playerName, myScorePosition1);
        displayHighScorePosition(playerName, myScorePosition2);
        displayHighScorePosition(playerName, myScorePosition3);
        displayHighScorePosition(playerName, myScorePosition4);
        displayHighScorePosition(playerName, myScorePosition5);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(" " + playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerPosition) {
        int position = 4;

        if (playerPosition >= 1000) position = 1;
        else if (playerPosition >= 500) position = 2;
        else if (playerPosition >= 100) position = 3;
        return position;
    }
}
