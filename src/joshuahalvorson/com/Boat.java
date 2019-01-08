package joshuahalvorson.com;

public class Boat extends Vehicle implements WaterTravel{
    @Override
    public void travel() {
        System.out.println("Boat is traveling");
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing");
    }
}
