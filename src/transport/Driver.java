package transport;

public abstract class Driver<T extends Transport> {
    private final String name;
    private boolean presenceDriversLicense;
    private int experience;

    public Driver(String name, boolean presenceDriversLicense, int experience) {
        this.name = name;
        this.presenceDriversLicense = presenceDriversLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isPresenceDriversLicense() {
        return presenceDriversLicense;
    }

    public void setPresenceDriversLicense(boolean presenceDriversLicense) {
        this.presenceDriversLicense = presenceDriversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove(T transport);
    public abstract void stopMove(T transport);
    public abstract void refuel(T transport);

    public void printInfo(T transport){
        System.out.println("Водитель "+ name +" управляет автомобилем "+transport.getBrand()+" "+transport.getModel() + " и будет участвовать в заезде");
    }
}
