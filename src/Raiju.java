public class Raiju extends Vehicle implements AirTravel, GroundTravel {
    @Override
    public void fly() {
        System.out.println("The raiju turns into lightning and travels through clouds.");
    }

    @Override
    public void drive() {
        System.out.println("The raiju travels with its paws.");
    }

    @Override
    public void travel() {
        System.out.println("The raiju is traveling.");
    }
}
