public class Main {

    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter();
        helicopter.travel();
        Airplane airplane = new Airplane();
        airplane.travel();
        AircraftCarrier carrier = new AircraftCarrier();
        carrier.travel();
        Car car = new Car();
        car.travel();
        Sailboat sailboat = new Sailboat();
        sailboat.travel();
        Tank tank = new Tank();
        tank.travel();
    }
}
