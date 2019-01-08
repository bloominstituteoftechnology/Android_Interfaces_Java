package joshuahalvorson.com;

public class Boat extends Vehicle implements WaterTravel{
    @Override
    public void travel() {
        sail();
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing");
    }
}
