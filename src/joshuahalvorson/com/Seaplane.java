package joshuahalvorson.com;

public class Seaplane extends Vehicle implements AirTravel, WaterTravel{
    @Override
    public void fly() {
        System.out.println("Seaplane is flying");
    }

    @Override
    public void travel() {
        System.out.println("Seaplane is traveling");
    }

    @Override
    public void sail() {
        System.out.println("Seaplane is sailing");
    }
}
