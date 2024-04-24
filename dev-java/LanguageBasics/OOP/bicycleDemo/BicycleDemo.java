package languageBasics.oop.bicycleDemo;

public class BicycleDemo {
    public static void main(String[] args) {
        GenericBicycle bike1 = new GenericBicycle();
        GenericBicycle bike2 = new TandemBike();

        bike1.speedUp(5);
        bike1.changeCadence(3);
        bike1.applyBreaks(2);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

    }
}
