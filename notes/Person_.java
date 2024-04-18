/* 
 * Access modifiers:
 * 
 * for classes:
 * - public - accessible by any other class
 * - default - accessible by classes in the same package (not specified public)
 * 
 * for attributes, methods, constructors:
 * - public
 * - private - within declared class
 * - protected - in the same package and subclasses
 * - default - in the same package
 */

/* 
 * Non-access modifiers:
 * for classes:
 * - final - the class cannot be inherited by other classes
 * - abstract - the class cannot be used to create objects
 * 
 * for attributes and methods:
 * - final - cannot be overridden/modified
 * - static - attributes and methods belongs to the class, rather than an object
 * - abstract - (on methods) can only be used in an abstract class, has no body abstract void run(); the body is provided by the subclass
 * - transient - attributes and methods are skipped when serializing the object containng them
 * - synchronized - methods can only be accessed by one thread at a time
 * - volatile - the value of an attribute is not cached thread-locally, and is always read from the "main memory"
 * 
 */

/* 
 * final - if you don't want the ability to override existing attribute values
 * 
 * static - can be accessed without createing an object of the class (unlike public)
 * 
 * abstract - belongs to an abstract class, and does not have a body, the body is provided by the subclass
 * 
 * 
 * 
 * 
 */

public class Person_ {
    String firstName;
    String lastName;
    int age;

    public Person_(String _firstName, String _lastName, int _age) {
        firstName = _firstName;
        lastName = _lastName;
        age = _age;
    }

    public static void main(String[] args) {

        Person_ peter = new Person_("Peter", "One", 25);
        printPerson(peter.firstName, peter.lastName, peter.age);

        peter.firstName = "Peter One";
        printPerson(peter.firstName, peter.lastName, peter.age);

        peter.printAge(12);

        peter._printPerson();
    }

    static void printPerson(String firstName, String lastName, int age) {
        System.out.println(firstName + " " + lastName + " is " + age + " years old.");
    }

    public void _printPerson() {
        System.out.println(firstName + " " + lastName + " is " + age + " years old.");
    }

    public void printAge(int age) {
        System.out.println("age: " + age);
    }

}
