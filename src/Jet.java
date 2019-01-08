public class Jet extends Vehicle implements AirTravel {

    @Override
    public void fly() {
        System.out.println("flying using a jet engine and wings.");
    }

    @Override
    public void travel() {
        fly();
    }
}
