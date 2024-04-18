// methods

class Meth {
    public static void main(String[] args) {
        // myPrint("hello");
        Meth.myPrint("hello");

        String[] names = { "Peter", "Sam" };
        short[] ages = { 12, 25 };

        for (short i = 0; i < names.length; i++) {
            String ageString = getAgeString(names[i], ages[i]);
            System.out.println(ageString);
        }
    }

    static void myPrint(String s) {
        System.out.println(s);
    }

    static String getAgeString(String name, short age) {
        return name + " is " + age + " years old.";
    }

    // method overloading: single method name for difference parameters
    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b) {
        return a + b;
    }
}
