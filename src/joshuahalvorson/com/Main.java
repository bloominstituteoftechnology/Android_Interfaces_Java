package joshuahalvorson.com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Boat());
        vehicles.add(new Bicycle());
        vehicles.add(new Plane());
        vehicles.add(new Helicopter());
        vehicles.add(new Seaplane());
        for(Vehicle v : vehicles){
            v.travel();
        }
    }
}
