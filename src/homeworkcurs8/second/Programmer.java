package homeworkcurs8.second;

import java.time.LocalDate;
public class Programmer extends Employee {
    private String langue;

    public Programmer(String firstName, String lastName, LocalDate birthDate, String position, LocalDate dateOfEmployement, String address) {
        super(firstName, lastName, birthDate, position, dateOfEmployement, address);
    }
}
