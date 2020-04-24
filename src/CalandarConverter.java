public class CalandarConverter {
    final static int MONDAY = 1;
    final static int TUESDAY = 2;
    final static int WEDNESDAY = 3;
    final static int THURSDAY = 4;
    final static int FRIDAY = 5;
    final static int SATURDAY = 6;
    final static int SUNDAY = 7;

    static String convertDayToString(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case MONDAY:
                dayName = "Poniedziałek";
                break;
            case TUESDAY:
                dayName = "Wtorek";
                break;
            case WEDNESDAY:
                dayName = "Środa";
                break;
            case THURSDAY:
                dayName = "Czwartek";
                break;
            case FRIDAY:
                dayName = "Piątek";
                break;
            case SATURDAY:
                dayName = "Sobote";
                break;
            case SUNDAY:
                dayName = "Niedziela";
                break;
            default:
                dayName = "unknown";
        }
        return dayName;
    }
}
