// arrays. for dynamic use ArrayList

class Arr {
    public static void main(String[] args) {

        char[] s = { 'h', 'e', 'n', 'l', 'l', 'o' };

        System.out.println("array length: " + s.length);

        // for-each
        for (char c : s) {
            if (c == 'e')
                continue;
            if (c == 'l')
                break;
            System.out.println(c);
        }

        // multi-dimensional array
        int[][] m = { { 1, 2, 3 }, { 4, 5, 6 } };

        System.out.println(m[1][2]);

        for (short i = 0; i < m.length; i++) {
            System.out.println("line: " + (i + 1));
            for (short j = 0; j < m[i].length; j++) {
                System.out.println("m[" + i + "]" + "[" + j + "]: " + m[i][j]);
            }
        }

        /*
         * for (int i = 0; i < s.length(); i++) {
         * 
         * char c = s.charAt(i);
         * int n = c;
         * 
         * System.out.println("c: " + c);
         * System.out.println("n: " + n);
         * 
         * }
         */

        /*
         * if (args.length > 0) {
         * 
         * String input = args[0];
         * System.out.println(input);
         * int inputNumber = 0;
         * 
         * for (int p = input.length(), i = 0; i < input.length(); i++, p--) {
         * char c = input.charAt(i);
         * int n = (int) c;
         * inputNumber += n * power(10, p);
         * System.out.println("i: " + i);
         * System.out.println("c: " + c);
         * System.out.println("p: " + p);
         * System.out.println("n: " + n);
         * System.out.println("inputNumber: " + inputNumber);
         * }
         * 
         * // System.out.println(inputNumber);
         * } else {
         * System.out.println("no argument was provided");
         * }
         */
    }

    public static int power(int a, int b) {

        int x = 1;

        while (b > 0) {
            if (b % 2 == 0) {
                a *= a;
                b /= 2;
            } else {
                x *= a;
                b--;
            }
        }

        return x;

    }
}
