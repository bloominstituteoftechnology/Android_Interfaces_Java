package joshuahalvorson.com;

public class Bicycle extends Vehicle implements GroundTravel{
    @Override
    public void drive() {
        System.out.println("Bicycle is driving by wheels");
    }

    @Override
    public void travel() {
        drive();
    }
}
