public enum Day {
    // public static final Day MONDAY = new Day();
    // Each enum contant is an instance of Day 
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // An enum can have variables , Methods , Constructor (Private)
    public boolean isWeekend() {
        return this == SUNDAY || this == SATURDAY;
    }
}
