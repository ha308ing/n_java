package languageBasics.operations.arrayCopyDemo;

/* 
 * java.util.Arrays
 * - binarySearch
 * - equals
 * - fill
 * - sort
 * - parallelSort
 * - stream
 * - toString
 */

public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        // String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        // print content of copyTo
        // java.util.Arrays.stream(copyTo).map(
        // coffee -> coffee + " "
        // ).forEach(System.out::print);

        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
