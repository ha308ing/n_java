package languageBasics.flowControl.breakWithLabelDemo;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        int i, j = 0;
        int searchFor = 5;
        boolean isFound = false;

        search:

        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == searchFor) {
                    isFound = true;
                    // which label to break
                    // control moves to the statement after the label
                    break search;
                }
            }
        }

        if (isFound) {
            System.out.println(searchFor + " is found at [" + i + "][" + j + "]");
        } else {
            System.out.println(searchFor + " is not found in the array");
        }

    }
}
