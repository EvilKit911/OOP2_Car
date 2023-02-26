package transport;

public class NoLicenseExeption extends Exception{

    public NoLicenseExeption() {

    }
    public NoLicenseExeption(String message) {
        super(message);
    }
}
