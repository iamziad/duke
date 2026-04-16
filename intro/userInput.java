import java.util.InputMismatchException;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        int currentYear = 2026;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {
        String userName = System.console().readLine("Hi, What's your name? ");
        System.out.println("- Hi, " + userName + "!");

        String userYearOfBirth = System.console().readLine("What year you born? ");
        int age = currentYear - Integer.parseInt(userYearOfBirth);

        return "- So you are " + age + " years old!";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, What's your name? ");

        String userName = sc.nextLine();
        System.out.println("- Hi, " + userName + "!");

        int age;

        do {
            int userYearOfBirth = 0;

            System.out.println("What year you born? ");

            try {
                userYearOfBirth = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine(); // clearing the buffer
                System.out.println("Error: your year of birth shouldn't contain letters");
            }

            age = checkData(currentYear, userYearOfBirth);

        } while (age == -1);

        return "- So you are " + age + " years old!";
    }

    public static int checkData(int currentYear, int userYearOfBirth) {
        int minimumYear = currentYear - 125;

        if (userYearOfBirth < minimumYear || userYearOfBirth > currentYear) {
            return -1;
        }

        return currentYear - userYearOfBirth;
    }

}
