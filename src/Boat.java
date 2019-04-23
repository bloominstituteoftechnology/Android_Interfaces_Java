public class Boat extends Vehicle implements WaterTravel {
    @Override
    void Travel() {
        swim();
    }

    @Override
    public void swim() {
      System.out.println("Swim with props");
    }
}
