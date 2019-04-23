public class Limosine extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        System.out.println("Ride like a G");
    }

    @Override
    public void travel() {
        drive();
    }
}
