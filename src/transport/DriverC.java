package transport;

public class DriverC extends Driver<Truck>{
    public DriverC(String name, boolean presenceDriversLicense, int experience, String licensType) throws NoLicenseExeption {
        super(name, presenceDriversLicense, experience, licensType);
        if (licensType == null || !licensType.equals("C")) {
            throw new NoLicenseExeption("Не указан тип ВУ, или указан не верно !!!");
        }
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
