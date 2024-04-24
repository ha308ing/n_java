package languageBasics.oop.bicycleDemo;

interface Bicycle {

    void changeGear(int newValue);

    void changeCadence(int newValue);

    void speedUp(int increment);

    void applyBreaks(int decrement);

    void printStates();

}
