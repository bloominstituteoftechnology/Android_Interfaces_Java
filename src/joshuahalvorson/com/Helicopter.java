package joshuahalvorson.com;

public class Helicopter extends Vehicle implements AirTravel{
    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void travel() {
        System.out.println("Helicopter is traveling");
    }
}
