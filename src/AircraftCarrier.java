public class AircraftCarrier extends Vehicle implements WaterTravel {

    public AircraftCarrier () {

    }

    @Override
    public void travel() {
        sail();
    }

    @Override
    public void sail() {
        System.out.println("The Aircraft Carrier sails using its propeller");
    }
}
