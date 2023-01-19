package transport;

public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, int maximumSpeed, double engineVolume) {
        super(brand, model, maximumSpeed, engineVolume);
    }

    public Car(String brand, String model, int maximumSpeed, double engineVolume, BodyType bodyType) {
        super(brand, model, maximumSpeed, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        if (bodyType == null) {
            bodyType = BodyType.NODATA;
            return bodyType;
        } else {
            return bodyType;
        }
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void driveStart() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " Начал движение" );
    }

    @Override
    public void driveStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " Закончил движение" );
    }

    @Override
        public String toString() {
            return "Машина: " +
                    "Марка " + getBrand() +
                    ",Модель " + getModel() +
                    ", Максимальная скорость " + getMaximumSpeed() +
                    ", Обьём двигателя " + getEngineVolume() +
                    ", Тип кузова " + getBodyType().toString();

        }

    @Override
    public void passDiagnostics() {
        System.out.println("Автомобиль "+ getBrand() + " "+ getModel() + " прошёл диагностику");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль "+ getBrand() + " "+ getModel() + " заехал на питстоп");
        System.out.println("Автомобиль " + getBrand() + " "+ getModel() + " заправил Автомобиль");
        System.out.println("Автомобиль " + getBrand() + " "+ getModel() + " выехал на трассу");
    }

    @Override
    public int bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " "+ getModel() + " = "+ (int)(Math.random()*8) + " минут" );
        return (int)(Math.random()*8);
    }

    @Override
    public int maxSpeed() {
        System.out.println("Максимальная скорость круга " + getBrand() + " " + getModel() + " = " + (int)(Math.random()*getMaximumSpeed()) + " км/ч");
        return (int)(Math.random()*getMaximumSpeed());
    }
}
