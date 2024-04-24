package languageBasics.loops.switchDemo;

import java.util.ArrayList;
import java.util.List;

public class SwitchDemo {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    };

    public static void main(String[] args) {

        /*
         * switch( <selector> )
         * 
         * selector variable types:
         * - byte, short, char, int
         * - Character, Byte, Integer
         * - enumerated types
         * - String (as in String.equals)
         * 
         * cannot be used as selector variable:
         * boolean, long, float, double, null?
         */

        getQuarter(2);
        // breakDemo(7);
        // multipleLabelsDemo(2024, 4);
        // modifiedSwitchDemo(Day.SATURDAY);

    }

    static void getQuarter(int quarter) {
        /*
         * String quareterLabel = null;
         * switch (quarter) {
         * case 0:
         * quareterLabel = "Q1 - Winter";
         * break;
         * case 1:
         * quareterLabel = "Q2 - Spring";
         * break;
         * case 2:
         * quareterLabel = "Q3 - Summer";
         * break;
         * case 3:
         * quareterLabel = "Q4 - Autumn";
         * break;
         * default:
         * quareterLabel = "Unknown quarter";
         * }
         */

        String quareterLabel = switch (quarter) {
            case 0 -> "Q1 - Winter";
            case 1 -> "Q2 - Spring";
            case 2 -> "Q3 - Summer";
            case 3 -> "Q4 - Autumn";
            default -> "Unknown quarter";
        };

        /*
         * see YieldDemo
         * fall through semantics does not apply
         * case 0 : yield "Q1 - Winter";
         * case 1 : yield "Q2 - Spring";
         * case 2 : yield "Q3 - Summer";
         * case 3 : yield "Q4 - Autumn";
         * default : System.out.println("Unknown quarter");
         * yield "Unknown quarter";
         */
        System.out.println("Quarter " + ++quarter + ": " + quareterLabel);
    }

    static void breakDemo(int month) {
        // add all month after provided month number
        List<String> futureMonths = new ArrayList<>();

        switch (month) {
            case 1:
                futureMonths.add("January");
            case 2:
                futureMonths.add("February");
            case 3:
                futureMonths.add("March");
            case 4:
                futureMonths.add("April");
            case 5:
                futureMonths.add("May");
            case 6:
                futureMonths.add("June");
            case 7:
                futureMonths.add("July");
            case 8:
                futureMonths.add("August");
            case 9:
                futureMonths.add("September");
            case 10:
                futureMonths.add("October");
            case 11:
                futureMonths.add("November");
            case 12:
                futureMonths.add("December");
                break;
            default:
                break;
        }

        System.out.println(futureMonths.toString());
    }

    static void multipleLabelsDemo(int year, int month) {
        // print number of days in specified month.year
        int numDays = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0)) ||
                        (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                break;
        }

        if (numDays == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println("In " + month + "/" + year + " " + numDays + " days");
        }
    }

    static void modifiedSwitchDemo(Day day) {
        int len = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> 0;
        };

        if (len == 0) {
            System.out.println(day + " is a wrong day");
        } else {
            System.out.println(day + " has length: " + len);
        }
    }
}
