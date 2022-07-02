package HomeWorcks.home9.HomeWorck92;

import java.time.LocalDate;
import java.time.Period;

public class MainPerson extends Employee {
    public MainPerson(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String fullName() {
        return getFirstName() + " " + getLastName();
    }

    public Period age() {
        LocalDate today = LocalDate.of(2022, 06, 28);
        Period period = Period.between(getBrithday(), today);
        return period;
    }

}


