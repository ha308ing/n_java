// https://dev.java/learn/classes-objects/nested-classes#declaring-local-classes

// validates two phone numbers

package classesObjects.nestedClasses.localClassDemo;

/**
 * LocalClass
 */
public class LocalClassDemo {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
        // outer member must be final or effectively final (not changed anywhere)
        final int numberLength = 10;

        class PhoneNumber {
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");

                if (currentNumber.length() == numberLength) {
                    formattedPhoneNumber = currentNumber;
                } else {
                    formattedPhoneNumber = null;
                }
            }

            /*
             * since JDK 8 local class in a method
             * can access the method's parameters
             * 
             * public void PrintNumbers() {
             * System.out.println("Original numbers are " +
             * phoneNumber1 + " and " +
             * phoneNumber2);
             * }
             * 
             * ...
             * 
             * myNumber1.printOriginalNumbers();
             */

            public String getNumber() {
                return formattedPhoneNumber;
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());

        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());
    }

    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }

}
