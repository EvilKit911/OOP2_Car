package transport;

    public abstract class Transport {

        private final String brand;
        private final String model;

        private final int year;
        private final String country;
        private String color;
        int maximumSpeed;


        public Transport(String brand,
                         String model,
                         int year,
                         String country,
                         String color,
                         int maximumSpeed) {
            setColor(color);
            setMaximumSpeed(maximumSpeed);


            if (year <= 0) {
                 this.year = 2000;
            } else {
                this.year = year;
            }
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
            if (country == null || country.isEmpty()) {
                this.country = "Default";
            } else {
                this.country = country;
            }
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

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            if (color == null || color.isEmpty() || color.isBlank()) {
                color = "Белый";
                this.color = color;
            } else {
                this.color = color;
            }
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

    }


