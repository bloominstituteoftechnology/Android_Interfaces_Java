public class Chevy extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        System.out.println("Go Offroading");

    }

    @Override
    public void travel() {
        drive();
    }
}
