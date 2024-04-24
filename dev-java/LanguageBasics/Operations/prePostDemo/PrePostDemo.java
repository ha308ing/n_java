package languageBasics.operations.prePostDemo;

public class PrePostDemo {
    public static void main(String[] args) {

        int i = 3;
        i++;

        System.out.println("i: " + i);

        System.out.println("after i++. i: " + i);

        ++i;
        System.out.println("after ++i. i: " + i);

        System.out.println("++i: " + (++i));

        System.out.println("i++: " + (i++));

        System.out.println("i: " + i);
    }
}
