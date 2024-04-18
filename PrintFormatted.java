// lambda expression in a method

public class PrintFormatted {
    public static void main(String[] args) {

        StringFunction exclaim = (s) -> s + "!";
        StringFunction question = (s) -> s + "?";

        printFormatted("Hello", exclaim);
        printFormatted("Hello", question);

    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

}

interface StringFunction {
    String run(String str);
}
