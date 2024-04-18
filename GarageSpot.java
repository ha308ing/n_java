public class GarageSpot {

    private Car _car;
    private Person _owner;
    private int _spotNumber;

    public GarageSpot(Car car, Person owner, int spotNumber) {
        _car = car;
        _owner = owner;
        _spotNumber = spotNumber;
    }

    public Car get_car() {
        return _car;
    }

    public Person get_owner() {
        return _owner;
    }

    public int get_spotNumber() {
        return _spotNumber;
    }

}
