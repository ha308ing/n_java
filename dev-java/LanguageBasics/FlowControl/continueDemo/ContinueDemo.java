package languageBasics.flowControl.continueDemo;

public class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";

        int stringLength = searchMe.length();
        int count = 0;

        for (int i = 0; i < stringLength; i++) {
            if (searchMe.charAt(i) != 'p')
                continue;
            count++;
        }

        System.out.println("p appeared: " + count + " times");

    }
}
