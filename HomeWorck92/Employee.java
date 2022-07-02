package HomeWorcks.home9.HomeWorck92;

import java.time.LocalDate;


public class Employee implements Person {

    private String position;
    private String firstName;
    private String lastName;
    private String adress;
    private LocalDate birthday ;
    private LocalDate dateOfEmployment;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBrithday() {
        return birthday;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    public  Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setBirthday(int a, int b, int c) {
        this.birthday = LocalDate.of(a, b, c);
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }
}

