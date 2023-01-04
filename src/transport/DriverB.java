package transport;

public class DriverB extends Driver<Car>{
    public DriverB(String name, boolean presenceDriversLicense, int experience) {
        super(name, presenceDriversLicense, experience);
    }

    @Override
    public void startMove(Car transport) {
        transport.driveStart();
    }

    @Override
    public void stopMove(Car transport) {
        transport.driveStop();
    }

    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель автомобиля " +getName()+" заехал на питстоп");
        transport.pitStop();
    }
}
