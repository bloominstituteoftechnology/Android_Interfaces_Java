public class Helicopter extends Vehicle implements AirTravel {

    @Override
    public void fly() {
        System.out.println("flying using an engine and rotors.");
    }

    @Override
    public void travel() {
        fly();
    }
}