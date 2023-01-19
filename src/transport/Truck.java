package transport;

public class Truck extends Transport implements Competing {

    private LoadCopasity loadCopasity;


    public Truck(String brand, String model, int maximumSpeed, double engineVolume) {
        super(brand, model, maximumSpeed, engineVolume);
    }

    public Truck(String brand, String model, int maximumSpeed, double engineVolume, LoadCopasity loadCopasity) {
        super(brand, model, maximumSpeed, engineVolume);
        this.loadCopasity = loadCopasity;
    }

    public LoadCopasity getLoadCopasity()
    {
        if (loadCopasity == null) {
            loadCopasity = LoadCopasity.NODATA;
            return loadCopasity;
        }else{
            return loadCopasity;
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " Прошел диагностику" );
    }

    @Override
    public void driveStart() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " Начал движение" );
    }

    @Override
    public void driveStop() {
        System.out.println("Тягач " + getBrand() + " " + getModel() + " Закончил движение" );
    }

    public String toString() {
        return "Грузовик: " +
                "Марка " + getBrand() +
                ",Модель " + getModel() +
                ", Максимальная скорость " + getMaximumSpeed() +
                ", Обьём двигателя " + getEngineVolume() +
                ", Класс грузоподьёмности " + getLoadCopasity();
    }

    @Override
    public void pitStop() {
        System.out.println("Тягач " + getBrand() + " "+ getModel() +" заехал на питстоп");
        System.out.println("Тягач " + getBrand() + " "+ getModel() +" заправил Тягач");
        System.out.println("Тягач " + getBrand() + " "+ getModel() +" выехал на трассу");
    }

    @Override
    public int bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " "+ getModel() + " = "+ (int)(Math.random()*10) + " минут" );
        return (int)(Math.random()*10);
    }


    @Override
    public int maxSpeed() {
        System.out.println("Максимальная скорость круга " + getBrand() + " " + getModel() + " = " + (int)(Math.random()*getMaximumSpeed()) + " км/ч");
        return (int)(Math.random()*getMaximumSpeed());
    }
}

