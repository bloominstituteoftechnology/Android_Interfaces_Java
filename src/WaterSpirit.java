public class WaterSpirit extends Vehicle implements WaterTravel, GroundTravel {
    @Override
    public void drive() {
        System.out.println("The water spirit walks very slowly on land.");
    }

    @Override
    public void travel() {
        System.out.println("The water spirit is traveling.");
    }

    @Override
    public void sail() {
        System.out.println("The water spirit weaves its way through bodies of water.");
    }
}
