package task8.additional;

public class TreatmentPlane {

    private Patient patient;
    private int code;

    public TreatmentPlane(Patient patient, int code) {
        this.patient = patient;
        this.code = code;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
