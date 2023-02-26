package transport;

public class DriverD extends Driver<Bus>{
    public DriverD(String name, boolean presenceDriversLicense, int experience, String licensType) throws NoLicenseExeption {
        super(name, presenceDriversLicense, experience, licensType);
        if (licensType == null || !licensType.equals("D")) {
            throw new NoLicenseExeption("Не указан тип ВУ, или указан не верно !!!");
        }
    }

    @Override
    public void startMove(Bus transport) {
        transport.driveStart();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.driveStop();
    }

    @Override
    public void refuel(Bus transport) {
        System.out.println("Водитель автобуса " +getName()+" заехал на питстоп");
        transport.pitStop();
    }
}
