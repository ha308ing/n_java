// get array, print original and sorted

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt(), i = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (i < n) {
            int e = scanner.nextInt();
            arr.add(e);
            i++;
        }

        i = 0;

        Numbers.printArray("\nOriginal array: ", arr);
        Collections.sort(arr);
        Numbers.printArray("\nSorted array: ", arr);
        scanner.close();

        Consumer<Integer> printNumber = (k) -> {
            System.out.print(k);
        };

        System.out.println("\nPrinted with lambda:");
        arr.forEach(printNumber);

    }

    static void printArray(String title, ArrayList<Integer> arr) {
        int i = 0;
        int n = arr.size();
        System.out.print(title);
        while (i < n) {
            System.out.print((i == 0) ? arr.get(i) : " " + arr.get(i));
            i++;
        }
    }

}
