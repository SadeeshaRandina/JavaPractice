import java.util.Scanner;
import java.util.Calendar;

class Result {

    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();
        // Set the date with the given year, month (subtract 1 because Calendar months are 0-based), and day
        calendar.set(year, month - 1, day);
        // Get the day of the week as an integer (1=Sunday, 2=Monday, ..., 7=Saturday)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        // Array to map the integer day to the corresponding day of the week in capital letters
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        // Return the corresponding day of the week
        return days[dayOfWeek - 1];
    }

}

public class Calender {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        String res = Result.findDay(month, day, year);
        System.out.println(res);
    }
}
