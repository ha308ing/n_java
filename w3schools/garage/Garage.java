package garage;

import java.util.ArrayList;

public class Garage {

    private ArrayList<GarageSpot> garage = new ArrayList<GarageSpot>();

    public ArrayList<GarageSpot> getGarage() {
        return garage;
    }

    public int getGarageSize() {
        return garage.size();
    }

    public void addSpot(GarageSpot garageSpot) {
        garage.add(garageSpot);
    }

    public GarageSpot getSpot(int i) {
        return garage.get(i);
    }

}
