public class Canoe extends Vehicle implements WaterTravel {

    @Override
    public void sail() {
        System.out.println("sailing using oars.");
    }

    @Override
    public void travel() {
        sail();
    }
}