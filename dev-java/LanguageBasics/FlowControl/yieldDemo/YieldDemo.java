// The yield statement exits from the current switch expression it is in (like return of the switch)
/* The yield statement is a statement that can be used in any case block of a switch statement. It comes with a value, that becomes the value of the enclosing switch statement. */

package languageBasics.flowControl.yieldDemo;

public class YieldDemo {

    static enum Day {
        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        String result = calculate(Day.FRIDAY);
        System.out.println(result);
    }

    static public String calculate(Day d) {
        return switch (d) {
            case SATURDAY, SUNDAY -> "week-end";
            default -> {
                int remainingWorkDays = 5 - d.ordinal();
                yield "Days to weekend: " + remainingWorkDays;
            }
        };
    }
}
