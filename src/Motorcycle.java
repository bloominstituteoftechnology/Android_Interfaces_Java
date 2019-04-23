public class Motorcycle extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        System.out.println("Ride Really Ridiculously Fast!! Zoom Zoom!!");
    }

    @Override
    void Travel() {
drive();
    }
}
