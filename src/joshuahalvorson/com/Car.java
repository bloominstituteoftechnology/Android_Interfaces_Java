package joshuahalvorson.com;

public class Car extends Vehicle implements GroundTravel{
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void travel() {
        System.out.println("Car is traveling");
    }
}
