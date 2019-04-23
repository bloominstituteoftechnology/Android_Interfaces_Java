public class Submarine extends Vehicle implements WaterTravel {
    @Override
    void Travel() {
        swim();
    }

    @Override
    public void swim() {
        System.out.println("Swim underwater");
    }
}
