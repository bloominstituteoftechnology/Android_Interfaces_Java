package joshuahalvorson.com;

public class Car extends Vehicle implements GroundTravel{
    @Override
    public void drive() {
        System.out.println("Car is driving with motor");
    }

    @Override
    public void travel() {
        drive();
    }
}
