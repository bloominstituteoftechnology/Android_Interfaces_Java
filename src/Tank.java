public class Tank extends Vehicle implements GroundTravel  {

    public Tank() {

    }

    @Override
    public void drive() {
        System.out.println("The Tank drives using a continuous track");
    }

    @Override
    public void travel() {
        drive();
    }
}