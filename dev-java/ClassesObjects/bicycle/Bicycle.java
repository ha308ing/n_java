package classesObjects.bicycle;

/*
 * variable types:
 * - field - class member variable
 * - parameter - a variable in a method declaration
 * - local variable - a avariable in a block of code
 */

public class Bicycle {
    // fields
    // [modifier] [type] [name]

    /*
     * modifier - control what other classes have access to
     * - public - accessible from all classes
     * - private - accessible only within its own class (make fields private,
     * accessible with methods (incapsulation))
     * 
     * 2 levels of access control:
     * - at the top level
     * 1) public - class is visible to all classes
     * 2) package-private (implicit) - within its own package
     * - at the member level:
     * 1) public
     * 2) private - can be accessed only in its own class
     * 3) protected - can be accessed within its own package and
     * by a subclass of its class
     * 4) package-private (implicit)
     * 
     * public: class, package, subclass, world
     * protectd: class, package, subclass
     * no modifier: class, package
     * private: class
     * 
     * static - static field / class variable (common to all objects)
     * associated with the class, not with objects
     * class methods cannot access intance variables and methods
     * 
     * final - indicates that the values of this field cannot change
     * (named uppercase with _)
     * static final COMPOUND_CONST = 3.16
     * 
     */

    /*
     * type
     * - primitive: int, float, boolean, etc.
     * - reference types: strings, arrays, objects
     */

    /*
     * name
     * variable naming from LanguageBasics
     * - the frist letter of a class name should be capitalized
     * the first (or only) word in a method name should be a verb
     */
    private int cadence;
    private int gear;
    private int speed;
    private int id;

    private static int numberOfBicycles = 0;

    // constructor
    /*
     * invoked to create objects from the class blueprint
     * like method, except:
     * - use the name of the class
     * - have no return type
     * 
     * like with method overloading,
     * use constructor overloading with different parameters, like:
     * public Bicycle() {} - to create object with default variables
     * 
     * if no constructor is provided,
     * compiler adds a no-argument default constructor
     * 
     * if a class has no explicit superclass,
     * then it has an implicit superclass of Object,
     * which does have a no-argument constructor
     * 
     */
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
        id = ++Bicycle.numberOfBicycles;
    }

    // methods
    /*
     * the only required elements of a method declaration:
     * [return type] [name] () {}
     * 
     * more general components:
     * [modifiers] [return type] [name] ([parametr list]) [exception list]
     * {[method body]}
     * 
     * The signature of the method:
     * method'sname and the paramter types: [name]([parameter types])
     *
     * name begins with a verb in lowercase,
     * followed by adjectives, nouns, etc. capitalized:
     * getAge, setAge, setUserId
     * 
     * Method overloading:
     * same name different parameters' types (different signatures)
     * methods differenciated by:
     * - number of arguments int the lists and their type
     * 
     * varargs - arbitrary number of values to a method:
     * public Polygon createPolygon(Point... corners) {}
     * the method can be called with any number of that paramenter, including none
     */
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getCadence() {
        return cadence;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public int getSpeed() {
        return speed;
    }

    public int getId() {
        return id;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    // method overloading
    public void draw(String s) {
    }

    public void drat(int i) {
    }

    public void draw(int i, double f) {
    }
    // method overloading end

}
