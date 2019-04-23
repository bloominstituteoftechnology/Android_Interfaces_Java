public class Helicopter extends Vehicle implements AirTravel {
    public Helicopter() {
    }


    @Override
    public void fly() {
        System.out.println("Fly with Fans");
    }

    @Override
    public void travel() {
        fly();
    }
}