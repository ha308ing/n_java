package garage;

import java.util.Scanner;

public class Person {
    private String _name;

    public Person(Scanner scanner) {
        input_name(scanner);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public void input_name(Scanner scanner) {
        System.out.print("Enter name: ");
        _name = scanner.nextLine();
    }
}
