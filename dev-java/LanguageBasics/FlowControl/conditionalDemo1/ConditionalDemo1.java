package languageBasics.flowControl.conditionalDemo1;

public class ConditionalDemo1 {
    public static void main(String[] args) {
        int value1 = 1, value2 = 2;
        boolean and = (value1 == 1) && (value2 == 2);
        boolean or = (value1 == 1) || (value2 == 2);

        if (and)
            System.out.println(value1 + " && " + value2 + " = " + and);

        if (or)
            System.out.println(value1 + " || " + value2 + " = " + or);

    }
}
