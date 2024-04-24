package languageBasics.oop.bicycleDemo;

public class TandemBike extends GenericBicycle {
    int numberOfSeats = 2;

    public void printStates() {
        super.printStates();
        System.out.println("Tandem bike has " + numberOfSeats + " seats.");
    }
}
