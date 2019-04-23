public class Airplane extends Vehicle implements AirTravel, GroundTravel {

    public Airplane() {

    }
    @Override
    public void fly() {
        System.out.println("The Airplane flies using its wings");
    }

    @Override
    public void drive() {
        System.out.println("The Airplane drives using its landing gear");
    }

    @Override
    public void travel() {
        fly();
        drive();
    }
}
