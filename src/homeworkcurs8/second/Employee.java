package homeworkcurs8.second;

import java.time.LocalDate;
public class Employee implements Person {
    private Object getAdress = null;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String position;
    private LocalDate dateOfEmployement;


        public Employee(String firstName, String lastName, LocalDate birthDate, String position, LocalDate dateOfEmployement,String address){
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.position = position;
            this.dateOfEmployement = dateOfEmployement;
            this.getAdress = getAdress;
        }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String getBirthday() {
        return null;
    }

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }
}
