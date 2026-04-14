public class SwitchChallenge {
    public static void main(String[] args) {
        String quarter = getQuarterOldWay("January");
        System.out.println(quarter);

        quarter = getQuarterNewWay("October");
        System.out.println(quarter);
    }

    public static String getQuarterOldWay(String month) {
        switch (month) {
            case "January", "February", "March":
                return "1st";
            case "April", "May", "June":
                return "2nd";
            case "July", "August", "September":
                return "3rd";
            case "October", "November", "December":
                return "4th";
        }

        return "Bad input";
    }

    public static String getQuarterNewWay(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = "bad input: " + month;
                yield badResponse;
            }
        };
    }
}
