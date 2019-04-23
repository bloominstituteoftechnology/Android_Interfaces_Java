import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Helicopter());
        vehicles.add(new Limosine());
        vehicles.add(new SkipperPlane());
        vehicles.add(new Yacht());
        vehicles.add(new Beoing747());
        vehicles.add(new Chevy());

        for (Vehicle vehicle: vehicles) {
            vehicle.travel();
        }


    }
}
