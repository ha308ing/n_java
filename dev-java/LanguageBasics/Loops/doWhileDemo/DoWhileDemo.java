package languageBasics.loops.doWhileDemo;

public class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;

        do {
            System.out.println("Count: " + count++);
        } while (count < 11);
    }

}
