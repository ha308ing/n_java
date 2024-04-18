import java.util.Scanner;
import mypackage.*;

public class Main {
    public static void main(String[] args) {

        String now = Time.getNow();

        System.out.println("Hello! It's " + now);
        MyPackageClass.main(args);

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many to add?: ");
        int numberOfSpots = scanner.nextInt();
        int counter = 0;
        Garage garage = new Garage();

        while (counter < numberOfSpots) {

            Person person = new Person(scanner);
            Car car = new Car(scanner);

            GarageSpot p = new GarageSpot(car, person, 25);

            garage.addSpot(p);
            counter++;
        }

        System.out.println("Cars in the garage:");

        for (GarageSpot i : garage.getGarage()) {
            System.out.println("----");
            Person owner = i.get_owner();
            Car _car = i.get_car();
            // owner.set_name("Sam");
            String ownerName = owner.get_name();
            String carBrand = _car.get_brand();
            String carColor = _car.get_color();
            int spot = i.get_spotNumber();

            _car.honk();

            System.out.println(
                    "Car: " + carColor + " " + carBrand + "\nOwner: " + ownerName + "\nSpot: " + spot);

        }

        scanner.close();

    }
}
