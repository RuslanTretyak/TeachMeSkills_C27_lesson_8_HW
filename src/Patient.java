public class Patient {
    private String name;
    private String surname;
    private int treatmentPlanCode;
    private Doctor doctor;

    public Patient(String name, String surname, int treatmentPlanCode) {
        this.name = name;
        this.surname = surname;
        this.treatmentPlanCode = treatmentPlanCode;
    }

    public int getTreatmentPlanCode() {
        return treatmentPlanCode;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
