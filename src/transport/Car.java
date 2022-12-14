package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gearBox;
    private final String typeBody;
    private final String registrationNumber;
    private int nuberOfSeats;
    private boolean summerTyres;


    public Car(String brand,
        String model,
        double engineVolume,
        String color,
        int year,
        String country,
        String typeBody,
        String registrationNumber) {

        if (brand == null|| brand.isEmpty()) {
            brand = "Default";
        }
        this.brand = brand;
        if (model == null|| model.isEmpty()) {
            model = "Default";
        }
        this.model = model;
        if (country == null|| country.isEmpty()) {
            country = "Default";
        }
        this.country = country;
        setEngineVolume(engineVolume);
        if (this.color == null|| this.color.isEmpty()) {
            this.color = "Белый";
        }
        this.color = color;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (typeBody == null|| typeBody.isEmpty()) {
            typeBody = "Default";
        }
        this.typeBody = typeBody;
        if (registrationNumber == null|| registrationNumber.isEmpty()) {
            registrationNumber = "x000xx000x";
        }
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        if (gearBox == null|| gearBox.isEmpty()) {
            gearBox = "Default";
        }
        this.gearBox = gearBox;
    }

    public int getNuberOfSeats() {
        return nuberOfSeats;
    }

    public void setNuberOfSeats(int nuberOfSeats) {
        if (nuberOfSeats <= 0) {
            nuberOfSeats = 5;
        }
        this.nuberOfSeats = nuberOfSeats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        setSummerTyres(!summerTyres);
    }
    public boolean tryNumber() {
    boolean result = true;
    result = result && registrationNumber.length() == 9;
        result = result && Character.isLetter(registrationNumber.charAt(0))
                && Character.isLetter(registrationNumber.charAt(4))
                && Character.isLetter(registrationNumber.charAt(5));
        result = result && Character.isDigit(registrationNumber.charAt(1))
                && Character.isDigit(registrationNumber.charAt(2))
                && Character.isDigit(registrationNumber.charAt(6))
                && Character.isDigit(registrationNumber.charAt(7))
                && Character.isDigit(registrationNumber.charAt(8));


        return result;
    }
    @Override
    public String toString() {
        return "Машина: " +
                "Марка " + brand +
                ",Модель " + model +
                ", Обьём двигателя = " + engineVolume +
                ", Цвет " + color  +
                ", Год выпуска=" + year +
                ", Страна производства " + country +
                ", Коробка передач " + gearBox +
                ", Тип кузова " + typeBody +
                ", Регистрационный номер " + registrationNumber +
                ", Количество мест " + nuberOfSeats +
                ", Тип шин " + summerTyres +
                '}';

    }
    public void print() {
        System.out.println(this);
    }
}
