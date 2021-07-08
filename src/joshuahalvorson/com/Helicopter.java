package joshuahalvorson.com;

public class Helicopter extends Vehicle implements AirTravel{
    @Override
    public void fly() {
        System.out.println("Helicopter is flying by blades");
    }

    @Override
    public void travel() {
        fly();
    }
}
