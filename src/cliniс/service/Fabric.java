package cliniс.service;

import cliniс.patient.Patient;
import cliniс.stuff.Dentist;
import cliniс.stuff.Doctor;
import cliniс.stuff.Surgeon;
import cliniс.stuff.Therapist;

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
