package HomeWorcks.home9.HomeWorck92;

public class DatabaeAdmin extends Employee{
    private String dbTechnology;

    public DatabaeAdmin(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getAdress() {
        return super.getAdress().concat("db.admin");
    }
}
