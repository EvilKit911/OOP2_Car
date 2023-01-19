package transport;

public class DriverB extends Driver<Car>{
    public DriverB(String name, boolean presenceDriversLicense, int experience, String licensType) throws NoLicenseExeption {
        super(name, presenceDriversLicense, experience, licensType);
        if (licensType == null || !licensType.equals("B")) {
            throw new NoLicenseExeption("Не указан тип ВУ, или указан не верно !!!");
        }
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
