package transport;

public class Bus extends Transport implements Competing {


    private Size size;


    public Bus(String brand, String model, int maximumSpeed, double engineVolume) {
        super(brand, model, maximumSpeed, engineVolume);
    }

    public Bus(String brand, String model, int maximumSpeed, double engineVolume, Size size) {
        super(brand, model, maximumSpeed, engineVolume);
        this.size = size;
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобусы не проходят диагностику");
    }

    @Override
    public void driveStart() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " Начал движение" );
    }

    @Override
    public void driveStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " Закончил движение" );
    }

    @Override
    public String toString() {
        return "Автобус: " +
                "Марка " + getBrand() +
                ",Модель " + getModel() +
                ", Максимальная скорость " + getMaximumSpeed() +
                ", Обьём двигателя " + getEngineVolume() +
                ", Количество мест " + getSize();
    }

    public Size getSize() {
        if (size == null) {
            size = Size.NODATA;
            return size;
        } else {
            return size;
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " "+ getModel() + " заехал на питстоп");
        System.out.println("Автобус " + getBrand() + " "+ getModel() + " заправил Автобус");
        System.out.println("Автобус " + getBrand() + " "+ getModel() + " выехал на трассу");
    }

    @Override
    public int bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " "+ getModel() + " = "+ (int)(Math.random()*15) + " минут" );
        return (int)(Math.random()*15);
    }

    @Override
    public int maxSpeed() {
        System.out.println("Максимальная скорость круга " + getBrand() + " " + getModel() + " = " + (int)(Math.random()*getMaximumSpeed()) + " км/ч");
        return (int)(Math.random()*getMaximumSpeed());
    }
}
