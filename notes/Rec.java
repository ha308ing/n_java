// recursion

class Rec {
    public static void main(String[] args) {

        int x = 10, s = sum(x), ss = sumSeq(x), sr = sumRange(2, x), srs = sumRangeSeq(2, x);

        System.out.println(s);
        System.out.println(ss);
        System.out.println(sr);
        System.out.println(srs);

    }

    /*
     * recursion function must have halting condition
     * when recursion function doesn't return itself, but const
     */

    static int sum(int x) {
        if (x > 0) {
            return x + sum(x - 1);
        } else {
            return 0;
        }
    }

    static int sumSeq(int x) {
        return x * (x + 1) / 2;
    }

    static int sumRange(int x, int y) {
        if (x < y) {
            return x + sumRange(x + 1, y);
        } else {
            return x;
        }
    }

    static int sumRangeSeq(int x, int y) {
        return (x + y) * (y - x + 1) / 2;
    }
}
