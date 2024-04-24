package languageBasics.operations.bitDemo;

public class BitDemo {
    // 32bits: 00000000000000000000000000000010
    static int binary = 0b10;

    public static void main(String[] args) {

        printBinary("binary");

        // ~ unary bitwise complement (inverts bits)
        // b: 00000000000000000000000000000010
        // ~b: 11111111111111111111111111111101
        binary = ~0b10;
        printBinary("~0b10");

        // << signed shifts left
        binary <<= 0b10;
        printBinary("binary <<= 0b10");

        // >> signed right shift (leftmost depends on sign extension)
        binary >>= 0b10;
        printBinary("binary >>= 0b10");

        // >>> unsigned right shift (leftmost is zero)
        binary >>>= 0b10;
        printBinary("binary >>>= 0b10");

        // & bitwise AND
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println("0x000F & 0x2222: " + (val & bitmask));

        // | bitwise inclusive OR
        int val1 = 0b10, val2 = 0b01, val3 = val1 | val2;
        System.out.println("0b10 | 0b01: " + val3);

        // ^ bitwise exclusive OR
        val2 = 0b010;
        val3 = val1 ^ val2;
        System.out.println("0b10 ^ 0b010: " + val3);
    }

    static void printBinary(String descriptionString) {
        String bitString = Integer.toBinaryString(binary);
        System.out.println(descriptionString + ": " + bitString + " (" + bitString.length() + ")");
    }
}
