import java.time.DayOfWeek;
import java.time.LocalDate;

public class Days {
    public enum DayWeekk {
        FRIDAY, MONDAY, SATURDAY, SUNDAY,
        THURSDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        DayOfWeek days = date.getDayOfWeek();

        switch (days) {
            case MONDAY:
                System.out.println("MONDAY");
                break;

            case TUESDAY:
                System.out.println("TUESDAY");
                break;

            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;

            case THURSDAY:
                System.out.println("THURSDAY");
                break;

            case FRIDAY:
                System.out.println("FRIDAY");
                break;

            default:
                System.out.println("Weekend");
        }
    }
}
