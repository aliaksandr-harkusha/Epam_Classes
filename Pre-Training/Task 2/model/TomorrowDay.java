package model;

public class TomorrowDay {
    private static int FIRST_DAY_OF_MONTH = 1;
    private static int FIRST_MONTH_OF_YEAR = 1;
    private static int LAST_DAY_OF_MONTH = 31;
    private static int LAST_MONTH_OF_YEAR = 12;

    // 7. Завтрашний день.
    public static void tomorrowFinder(String todayDateFormatYYYY_MM_DD) {
        String[] parts = todayDateFormatYYYY_MM_DD.split("_");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (month == LAST_MONTH_OF_YEAR && day == LAST_DAY_OF_MONTH) { //End of year
            year++;
            day = FIRST_DAY_OF_MONTH;
            month = FIRST_MONTH_OF_YEAR;
        } else if (day == LAST_DAY_OF_MONTH) { //End of 31-day month
            day = FIRST_DAY_OF_MONTH;
            month++;
        } else if (month == 4 || month == 6 || month == 9 || month == 11 && day == 30) { //months that have 30 days
            day = FIRST_DAY_OF_MONTH;
            month++;
        } else if (year % 400 == 0 && month == 2 && day == 28) { //February 28 days
            day = FIRST_DAY_OF_MONTH;
            month++;
        } else if (year % 4 == 0 && !(year % 100 == 0) && day == 29 && month == 2) { //February 29 days in a leap-year
            day = FIRST_DAY_OF_MONTH;
            month++;
        }
         else day++;
        System.out.println("Tomorrow is: year " + year + ", month " + month + ", day " + day);
    }


}
