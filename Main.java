import garage.GarageDemo;
import languageBasics.loops.enhancedForDemo.EnhancedForDemo;

public class Main {
    public static void main(String[] args) {
        printNames("Hello!", "Peter");

        EnhancedForDemo.main(args);

        GarageDemo.main(args);

    }

    static void printNames(String... names) {
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
