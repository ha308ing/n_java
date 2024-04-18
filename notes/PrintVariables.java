// print variables

public class PrintVariables {
    public static void main(String[] args) {
        /*
         * types:
         * - int
         * - float
         * - char ('')
         * - String ("")
         * - boolean
         */
        System.out.println("Hello world");

        int age = 25;
        String name = "Peter";

        System.out.println("How old are you, " + name + "?");

        System.out.print("old age: ");
        System.out.println(age);

        age = 30;
        System.out.print("new age: ");
        System.out.println(age);

        name = "Sam";
        System.out.println(name);
    }
}
