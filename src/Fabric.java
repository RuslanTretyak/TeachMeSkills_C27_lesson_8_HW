public class Fabric {
    public static Doctor chooseDoctor(Patient patient) {
        switch (patient.getTreatmentPlanCode()) {
            case (1):
                return new Surgeon("Сергей", "Семёнов");
            case (2):
                return new Dentist("Александр", "Семенов");
            default:
                return new Therapist("Семён", "Семенов");
        }
    }

}
