package languageBasics.oop.bicycleDemo;

public class GenericBicycle implements Bicycle {
    int gear = 1;
    int cadence = 0;
    int speed = 0;

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBreaks(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("cadence:" + cadence +
                " speed:" + speed +
                " gear:" + gear);
    }
}
