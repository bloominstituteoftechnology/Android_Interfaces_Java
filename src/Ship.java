public class Ship extends Vehicle implements WaterTravel {

    @Override
    public void sail() {
        System.out.println("sailing using an engine and a propeller.");
    }

    @Override
    public void travel() {
        sail();
    }
}