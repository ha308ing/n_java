// strings

public class Str {
    public static void main(String[] args) {

        /*
         * Escape: \", \', \\
         * 
         * Escape sequencies:
         * \n - new line
         * \r - carriage return
         * \t - tab
         * \b - backspace
         * \f - form feed
         */

        String str = "hello";

        // String length
        int strLength = str.length();

        System.out.print("\n");

        System.out.print("\n");

        // change case
        System.out.println(str + ": " + strLength);
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println(str);
        System.out.println("toLowerCase(): " + str.toLowerCase());

        System.out.print("\n");

        // String indexOf
        int indexOfL = str.indexOf("l");
        System.out.println("index of 'l': " + indexOfL);

        System.out.print("\n");

        // String concatenation
        String greet = "hello";
        String name = "Peter";
        String greeting = greet.concat(" ").concat(name);
        System.out.println("greeting: " + greeting);

        System.out.print("\n");

        // String and int concatenation
        String xs = "10", ys = "20";
        System.out.println("add strings: " + xs + ys);

        int xi = 10, yi = 20;
        System.out.println("add numbers: " + (xi + yi));
        System.out.println("add string and number: " + (xs + yi));
        System.out.println("add number and string: " + (xi + ys));
    }
}
