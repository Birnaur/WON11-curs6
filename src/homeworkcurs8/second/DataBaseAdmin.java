package homeworkcurs8.second;

import java.time.LocalDate;

public class DataBaseAdmin extends Programmer {


    private String dbTechnology;

    public DataBaseAdmin(String firstName, String lastName, LocalDate birthDate, String position, LocalDate dateOfEmployement, String address) {
        super(firstName, lastName, birthDate, position, dateOfEmployement, address);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    public void setDbTechnology(String dbTechnology) {
        this.dbTechnology = dbTechnology;
    }
}
