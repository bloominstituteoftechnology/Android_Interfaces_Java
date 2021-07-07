import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new DemonicFamiliar());
        vehicles.add(new MagicalShip());
        vehicles.add(new MagicBroom());
        vehicles.add(new Pegasus());
        vehicles.add(new Raiju());
        vehicles.add(new WaterSpirit());

        vehicles.forEach(n-> n.callAll());
    }

}
