package task8.additional;

public class Patient {
    private String namePatient;
    private String dateOfBirth;
    private String gender;

    public Patient(String namePatient, String dateOfBirth, String gender) {
        this.namePatient = namePatient;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient - " + "\n" +
                "Name patient = " + namePatient + "\n" +
                "Date of Birth = " + dateOfBirth + "\n" +
                "Gender = " + gender;
    }
}
