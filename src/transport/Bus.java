package transport;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               int year,
               String country,
               String color,
               int maximumSpeed) {
        super(brand, model, year, country, color, maximumSpeed);
    }

    @Override
    public String toString() {
        return "Автобус: " +
                "Марка " + getBrand() +
                ",Модель " + getModel() +
                ", Цвет " + getColor()  +
                ", Год выпуска=" + getYear() +
                ", Страна производства " + getCountry() +
                ", Максимальная скорость " + getMaximumSpeed() ;
    }
}
