package transport;

import java.util.ArrayList;

public abstract class Transport {

        private final String brand;
        private final String model;

        int maximumSpeed;

        private double engineVolume;


        public Transport(String brand,
                         String model,
                         int maximumSpeed,
                         double engineVolume) {

            setEngineVolume(engineVolume);
            setMaximumSpeed(maximumSpeed);



            if (brand == null || brand.isEmpty()) {
                this.brand = "Default";
            } else {
                this.brand = brand;
            }
            if (model == null || model.isEmpty()) {
                this.model = "Default";
            } else {
                this.model = model;
            }
            participantsRace = new ArrayList<>(60); // размечаем лист участников гоники
        }

    public ArrayList<Transport> getParticipantsRace() {
        return participantsRace;
    }

    public void checkRaceList() {
        for (int i = 0; i < participantsRace.size(); i++ ) {
            String j = String.valueOf(participantsRace.get(i));

            System.out.println("Участвует в заезде : " + j);

        }
    }

    public double getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(double engineVolume) {
            if (engineVolume <= 0) {
                this.engineVolume = 1.5;
            }else{
                this.engineVolume = engineVolume;
            }
        }
        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getMaximumSpeed() {
            return maximumSpeed;
        }

        public void setMaximumSpeed(int maximumSpeed) {
            if (maximumSpeed <= 0) {
                this.maximumSpeed = 60;
            } else {
                this.maximumSpeed = maximumSpeed;
            }
        }

        ArrayList<Transport> participantsRace; // создаем лист




        public abstract void driveStart();

        public abstract void driveStop();

        public abstract void passDiagnostics();

        public abstract void repairTransport();



    Mechanic auto = new Mechanic<Car>("Джон","AutoRepair");
    Mechanic autoTwo = new Mechanic<Car>("Сергей","AutoRepair");

    Mechanic bus = new Mechanic<Bus>("Костя","BusRepair");
    Mechanic busTwo = new Mechanic<Bus>("Коля","BusRepair");

    Mechanic truck = new Mechanic<Truck>("Артур","TruckRepair");
    Mechanic truckTwo = new Mechanic<Truck>("Дмитрий","TruckRepair");




    }


