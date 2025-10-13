public class EnumExample {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.SATURDAY;

        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(today + " is a weekend day! 🎉");
                break;
            default:
                System.out.println(today + " is a weekday.");
                break;
        }
    }
}