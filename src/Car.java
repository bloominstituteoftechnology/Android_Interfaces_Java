public class Car extends Vehicle implements GroundTravel {

    @Override
    public void drive() {
        System.out.println("driving using an engine and wheels.");
    }

    @Override
    public void travel() {
        drive();
    }
}