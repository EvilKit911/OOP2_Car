package transport;

public class Mechanic <T extends Transport>  {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        if (name == null && name.isEmpty() && name.isBlank()) {
            name = "No data";
            return name;
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        if (company == null && company.isEmpty() && company.isBlank()) {
            company = "No data";
            return company;
        } else {
            return company;
        }
    }

    @Override
    public String toString() {
        return " Механик " +
                 name +
                ", Компании " + company ;
    }
}

