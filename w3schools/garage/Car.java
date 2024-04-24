package garage;

import java.util.Scanner;

public class Car extends Vehicle {
    private String _brand;
    private String _color;

    public Car(Scanner scanner) {
        input_car(scanner);
    }

    public String get_brand() {
        return _brand;
    }

    public String get_color() {
        return _color;
    }

    public void honk() {
        System.out.print(this._brand + " honks: " + this.honkSound + " ");
        super.vehicleHonk();
    }

    public void input_car(Scanner scanner) {
        System.out.print("Enter brand: ");
        _brand = scanner.nextLine();
        System.out.print("Enter color: ");
        _color = scanner.nextLine();
    }
}
