import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Helicopter());
        vehicles.add(new Airplane());
        vehicles.add(new Motorcycle());
        vehicles.add(new Boat());
        vehicles.add(new Tank());
        vehicles.add(new Submarine());


        for(int i = 0; i  < vehicles.size(); i++){
            vehicles.get(i).Travel();
        }
    }
}
