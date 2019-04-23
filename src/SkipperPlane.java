public class SkipperPlane extends Vehicle implements WaterTravel, AirTravel {
    @Override
    public void fly() {
        System.out.println("Touch the sky");
    }

    @Override
    public void travel() {

        fly();
        sail();
    }

    @Override
    public void sail() {
        System.out.println("Go in for a landing");
    }
}
