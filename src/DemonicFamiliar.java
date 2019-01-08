public class DemonicFamiliar extends Vehicle implements AirTravel, GroundTravel, WaterTravel {
    @Override
    public void fly() {
        System.out.println("The familiar sprouts wings to fly.");
    }

    @Override
    public void drive() {
        System.out.println("The familiar sprouts hooves and grows larger legs.");
    }

    @Override
    public void travel() {
        System.out.println("The familiar heads into the astral plane and walks normally.");
    }

    @Override
    public void callAll() {
        fly();
        drive();
        travel();
        sail();
    }

    @Override
    public void sail() {
        System.out.println("The familiar sprouts a tail and all hands are webbed.");
    }
}
