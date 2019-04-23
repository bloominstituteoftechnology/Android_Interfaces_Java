public class Beoing747 extends Vehicle implements AirTravel {
    @Override
    public void fly() {
        System.out.println("Fly with Wings");
    }

    @Override
    public void travel() {
        fly();
    }
}
