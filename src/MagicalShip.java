public class MagicalShip extends Vehicle implements AirTravel, WaterTravel {
    @Override
    public void fly() {
        System.out.println("The magical ship glides through the skies.");
    }

    @Override
    public void travel() {
        System.out.println("The magical ship is travelling ");
    }

    @Override
    public void sail() {
        System.out.println("The magical ship is cresting over waves.");
    }
}
