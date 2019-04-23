public class Yacht extends Vehicle implements WaterTravel {


    @Override
    public void travel() {

        sail();
    }

    @Override
    public void sail() {
        System.out.println("Take to the seven seas");

    }
}
