public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

        if (this.brand == null|| this.brand.isEmpty()) {
            this.brand = "Default";
        }
        if (this.model == null|| this.model.isEmpty()) {
            this.model = "Default";
        }
        if (this.country == null|| this.country.isEmpty()) {
            this.country = "Default";
        }
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (this.color == null|| this.color.isEmpty()) {
            this.color = "Белый";
        }
        if (this.year <= 0) {
            this.year = 2000;
        }

    }

    @Override
    public String toString() {
        return "Марка " + brand + " Модель " + model + " Объём двигателя " + engineVolume + " Цвет кузова "
                + color + " Год производства " + year + " Страна сборки " + country;
    }
}
