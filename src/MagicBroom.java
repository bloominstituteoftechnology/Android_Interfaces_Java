public class MagicBroom extends Vehicle implements AirTravel {


    @Override
    public void travel() {
        System.out.println("The Magic Broom is traveling!");
    }

    @Override
    public void fly() {
        System.out.println("The Magic Broom soars through the skies!");
    }


}
