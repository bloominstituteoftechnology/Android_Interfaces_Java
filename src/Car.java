public class Car extends Vehicle implements GroundTravel {

    public Car() {}


    @Override
    public void drive() {
        System.out.println("The car drives using its wheels");
    }

    @Override
    public void travel() {
        drive();
    }
}
