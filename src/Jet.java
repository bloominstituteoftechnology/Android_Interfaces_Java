public class Jet extends Vehicle implements AirTravel {

    @Override
    public void fly() {
        System.out.println("flying with a jet engine and wings.");
    }

    @Override
    public void travel() {
        fly();
    }
}
