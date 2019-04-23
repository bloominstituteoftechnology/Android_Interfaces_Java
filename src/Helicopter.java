

public class Helicopter extends Vehicle implements AirTravel {

    public Helicopter() {}


    @Override
    public void fly() {
        System.out.println("The helicopter flies using blades");
    }

    @Override
    public void travel() {
        fly();
    }
}
