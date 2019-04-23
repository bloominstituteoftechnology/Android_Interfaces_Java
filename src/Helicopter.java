public class Helicopter extends Vehicle implements AirTravel {
    @Override
    public void fly() {
        System.out.println("Fly with Rotors.");
    }

    @Override
    void Travel() {
fly();
    }
}
