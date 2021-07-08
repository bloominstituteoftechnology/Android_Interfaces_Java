package joshuahalvorson.com;

public class Seaplane extends Vehicle implements AirTravel, WaterTravel{
    @Override
    public void fly() {
        System.out.println("Seaplane is flying by propellers");
    }

    @Override
    public void travel() {
        fly();
        sail();
    }

    @Override
    public void sail() {
        System.out.println("Seaplane is sailing by propellers and floats");
    }
}
