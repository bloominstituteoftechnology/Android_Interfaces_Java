package joshuahalvorson.com;

public class Bicycle extends Vehicle implements GroundTravel{
    @Override
    public void drive() {
        System.out.println("Bicycle is driving");
    }

    @Override
    public void travel() {
        System.out.println("Bicycle is traveling");
    }
}
