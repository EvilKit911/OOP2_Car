package transport;

public class DriverC extends Driver<Truck>{
    public DriverC(String name, boolean presenceDriversLicense, int experience) {
        super(name, presenceDriversLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.driveStart();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.driveStop();
    }

    @Override
    public void refuel(Truck transport) {
        System.out.println("Водитель тягоча " +getName()+" заехал на питстоп");
        transport.pitStop();
    }
}
