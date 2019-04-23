public class Airplane extends Vehicle implements AirTravel {
    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }

    @Override
    void Travel() {
        fly();
    }
}
