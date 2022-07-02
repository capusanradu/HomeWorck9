package HomeWorcks.home9.HomeWorck92;

public class Programmer extends Employee{

    private String languege;

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }


    @Override
    public String getPosition() {
        return "programator";
    }
}
