import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle;
        vehicle = new Helicopter();
        vehicles.add(vehicle);
        vehicle = new Jet();
        vehicles.add(vehicle);
        vehicle = new Ship();
        vehicles.add(vehicle);
        vehicle = new Canoe();
        vehicles.add(vehicle);
        vehicle = new Bulldozer();
        vehicles.add(vehicle);
        vehicle = new Car();
        vehicles.add(vehicle);

        for (Vehicle item:vehicles) {
            System.out.print(item.getClass().getName() + " travels by ");
            item.travel();
        }


    }
}
