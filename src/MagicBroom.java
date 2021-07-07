public class MagicBroom extends Vehicle implements AirTravel {


    @Override
    public void travel() {
        System.out.println("The magic broom is traveling!");
    }

    @Override
    public void callAll() {
        travel();
        fly();
    }

    @Override
    public void fly() {
        System.out.println("The magic broom soars through the skies!");
    }


}
