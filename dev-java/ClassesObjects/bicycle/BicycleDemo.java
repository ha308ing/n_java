package classesObjects.bicycle;

public class BicycleDemo {

    public static void main(String[] args) {

        Bicycle bicycleOne = new Bicycle(0, 0, 0);
        Bicycle bicycleTwo = new Bicycle(0, 0, 0);

        System.out.println("bicycleOne id: " + bicycleOne.getId());
        System.out.println("bicycleTwo id: " + bicycleTwo.getId());
        System.out.println("total number of bicycles: " + Bicycle.getNumberOfBicycles());

    }
}
