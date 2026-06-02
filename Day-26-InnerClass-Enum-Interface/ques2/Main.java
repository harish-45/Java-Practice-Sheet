public class Main {
    public static void main(String[] args) {
        // String[] days = { "monday", "tuesday", "wednesday", "thursday", "friday",
        // "saturday", "sunday" };

        for (Day day : Day.values()) {
            System.out.printf("The %s is Weekend : %b\n", day, day.isWeekend());
        }

    }
}
