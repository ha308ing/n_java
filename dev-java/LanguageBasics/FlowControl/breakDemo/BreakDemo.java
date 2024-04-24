package languageBasics.flowControl.breakDemo;

public class BreakDemo {
    public static void main(String[] args) {

        int[] arrayOfInts = { 4, 8, 15, 16, 23, 42 };

        int searchFor = 16;
        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index: " + i);
        } else {
            System.out.println(searchFor + " is not found in the array");
        }
    }
}
