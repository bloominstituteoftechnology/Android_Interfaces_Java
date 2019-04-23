public class Bulldozer extends Vehicle implements GroundTravel {

    @Override
    public void drive() {
        System.out.println("driving using an engine and tracks.");
    }

    @Override
    public void travel() {
        drive();
    }
}