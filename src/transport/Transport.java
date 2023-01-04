package transport;

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


        public abstract void driveStart();

        public abstract void driveStop();
    }


