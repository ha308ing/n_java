package languageBasics.operations.unaryDemo;

public class UnaryDemo {
    public static void main(String[] args) {

        int result = +1;
        // result is 1
        System.out.println("+1: " + result);

        result--;
        System.out.println("result--: " + result);

        result++;
        System.out.println("result++: " + result);

        result = -result;
        System.out.println("-result: " + result);

        boolean success = false;
        System.out.println("success: " + success);
        System.out.println("!success: " + (!success));

    }
}
