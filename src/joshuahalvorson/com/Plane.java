package joshuahalvorson.com;

public class Plane extends Vehicle implements AirTravel{
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void travel() {
        fly();
    }
}
