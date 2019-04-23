public class Tank extends Vehicle implements GroundTravel {
    @Override
    public void drive() {
        System.out.println("Drive with Tracks");
    }

    @Override
    void Travel() {
        drive();
    }
}
