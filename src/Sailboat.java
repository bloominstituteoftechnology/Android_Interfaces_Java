public class Sailboat extends Vehicle implements WaterTravel {

    public Sailboat() {}


    @Override
    public void travel() {
        sail();
    }

    @Override
    public void sail() {
        System.out.println("The Sailboat sails using its sail");
    }
}
