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
            case 1:
                dayName = "Poniedziałek";
                break;
            case 2:
                dayName = "Wtorek";
                break;
            case 3:
                dayName = "Środa";
                break;
            case 4:
                dayName = "Czwartek";
                break;
            case 5:
                dayName = "Piątek";
                break;
            case 6:
                dayName = "Sobote";
                break;
            case 7:
                dayName = "Niedziela";
                break;
            default:
                dayName = "unknown";
        }
        return dayName;
    }
}
