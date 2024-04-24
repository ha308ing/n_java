// https://dev.java/learn/classes-objects/more-on-classes#static-initialization-blocks
package classesObjects.initializingFields;

public class InitializingFields {
    public static void main(String[] args) {

        System.out.println(National.nationality);

    }

    public static class Person {
    }

    public static class National extends Person {

        /*
         * static initializing block:
         * static { ... code for initialization ... }
         */
        public static String nationality = initializeNationality();

        // private static method
        private static String initializeNationality() {
            // cannot be redefined
            return "Dolphin";
        }
    }

}
