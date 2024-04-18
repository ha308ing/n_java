class Variables {
    public static void main(String[] args) {
        /*
         * primitives:
         * 
         * numbers whole:
         * - byte: 1byte (1 * 8 bit -> 2^8 = 256): -128 .. 127
         * - short: 2bytes (2^(2 * 8b) = 65536): -32'768 .. 32'767
         * - int: 4bytes (2^32 = 4294967296): -2'147'483'648 .. 2'147'483'647
         * - long: 8bytes (2^64):
         * 9'223'372'036'854'775'808L .. * 9'223'372'036'854'775'807L
         * 
         * numbers floating point
         * - float: 4bytes: 6,7 decimal digits: 2.35f; 23E5f
         * - double: 8bytes: 15 decimal digits: 2.35d; 23E5d
         * 
         * - boolean: 1bit: true/false
         * - char: 2bytes: single character/letter or ASCII values: 'C' / ASCII: 67
         * 
         * non-primitive (reference types):
         * - String
         * - Array
         * - Class
         * 
         * type casting (auto - in reverse must be manual):
         * byte > short > char > int > long > float > double
         * 
         */
        // int a = 20, b = 30, c = 50;
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);

        char d = 68;
        System.out.println(d);

        String e = "hello";
        System.out.println(e);

        // type casting
        int myInt = 8;
        double myDouble = myInt;
        System.out.println(myDouble);

        // manual type casting
        myDouble = 8.5;
        myInt = (int) myDouble;
        System.out.println(myInt);
    }
}
