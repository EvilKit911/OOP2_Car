package transport;

import java.time.LocalDate;

public class Car extends Transport {

    public static class Key {

        private final boolean RemoteEngineStart;
        private final boolean KeylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            RemoteEngineStart = remoteEngineStart;
            KeylessAccess = keylessAccess;
        }

        public boolean getRemoteEngineStart() {
            return RemoteEngineStart;
        }

        public boolean getKeylessAccess() {
            return KeylessAccess;
        }
    }

        public static class Insurance{

            private final LocalDate expireDate;
            private final int cost;
            private final String numberIsurance;

            public LocalDate getExpireDate() {
                return expireDate;
            }

            public int getCost() {
                return cost;
            }

            public String getNumberIsurance() {
                return numberIsurance;
            }

            public Insurance(LocalDate expireDate, int cost, String numberIsurance) {
                if (expireDate == null) {
                    expireDate = LocalDate.now().plusDays(365);
                }
                this.expireDate = expireDate;
                if (cost <= 0) {
                    cost = 7000;
                }
                this.cost = cost;
                if (numberIsurance == null || numberIsurance.isEmpty()) {
                    numberIsurance = "XXXXXXXXX";
                }
                this.numberIsurance = numberIsurance;

            }
            public void printInsurance() {
                boolean expired = expireDate.isAfter(LocalDate.now());
                if (expired) {
                    System.out.println("Пора обновить страховку");
                }

            }
            public void printTryNumber() {
                boolean correct = numberIsurance.length() == 9;
                if (!correct) {
                    System.out.println("Номер страховки некорректный!");
                }
                }
            }






    private double engineVolume;

    private String gearBox;
    private final String typeBody;
    private final String registrationNumber;
    private int nuberOfSeats;
    private boolean summerTyres;

    private Key key;

    private Insurance insurance;


    public Car(String brand,
        String model,
        double engineVolume,
        String color,
        int year,
        String country,
               String typeBody,
               String registrationNumber,
               int maximumSpeed
               ) {

        super(brand, model, year, country, color, maximumSpeed );

        setEngineVolume(engineVolume);


        if (typeBody == null|| typeBody.isEmpty()) {
            typeBody = "Default";
        }
        this.typeBody = typeBody;

        if (registrationNumber == null|| registrationNumber.isEmpty()) {
            registrationNumber = "x000xx000x";
        }
        this.registrationNumber = registrationNumber;
        setKey(null);
        setInsurance(null);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false,false);
        }
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            insurance = new Insurance(null,7000,null);
        }
        this.insurance = insurance;
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
                "Марка " + getBrand() +
                ",Модель " + getModel() +
                ", Обьём двигателя = " + engineVolume +
                ", Цвет " + getColor()  +
                ", Год выпуска=" + getYear() +
                ", Страна производства " + getCountry() +
                ", Коробка передач " + gearBox +
                ", Тип кузова " + typeBody +
                ", Регистрационный номер " + getRegistrationNumber() +
                ", Количество мест " + nuberOfSeats +
                ", Тип шин " + summerTyres +
                ", Ключ: удалённый запуск " + key.RemoteEngineStart +
                ", бесключевой доступ " + key.KeylessAccess +
                ", Страховка: стоимость  " + insurance.cost+
                ", номер " + insurance.numberIsurance +
                ", срок действия " + insurance.expireDate+
                ", максимальная скорость " + maximumSpeed +
                '}';

    }
    public void print() {
        System.out.println(this);
    }
}
