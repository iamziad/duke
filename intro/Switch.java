public class Switch {
    public static void main(String[] args) {
        String name = "Ali";

        switch (name) {
            case "Ziad":
                System.out.println("Hello " + name);
                break;
            case "Ahmed":
                System.out.println("Hi " + name);
                break;
            case "Ali":
                System.out.println("Welcome " + name);
                break;
            case "Nobody":
            default:
                System.out.println("Hello Anonymous");
        }

        String greet = switch (name) {
            case "Ziad" -> "Hello " + name;
            case "Ahmed", "asd" -> "Hi " + name;
            case "Ali" -> "Welcome " + name;
            default -> {
                String anonymousGreet = "Hello Anonymous";
                yield anonymousGreet;
            }
        };

        System.out.println(greet);

    }
}
