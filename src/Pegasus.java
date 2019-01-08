public class Pegasus extends Vehicle implements AirTravel, GroundTravel {
    @Override
    public void fly() {
        System.out.println("Pegasus soars through the sky.");
    }

    @Override
    public void drive() {
        System.out.println("Pegasus gallops gracefully.");
    }

    @Override
    public void travel() {
        System.out.println("Pegasus majestically travels through.");
    }

    @Override
    public void callAll() {
        fly();
        drive();
        travel();
    }
}
