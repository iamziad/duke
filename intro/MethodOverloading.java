public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("ziad", 500);
        System.out.println("New score is " + newScore);

        newScore = calculateScore(500);
        System.out.println("New score is " + newScore);

        newScore = calculateScore();
        System.out.println("New score is " + newScore);
    }


    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Anonymous player" + "scored " + score + " points");
        return score * 1000;
    }
}
