package classesObjects.bicycle;

public class MountainBike extends Bicycle {
    // subclass field
    public int seatHeight;

    // constructor
    public MountainBike(
            int startHeight,
            int startCadence,
            int startSpeed,
            int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // methods
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
