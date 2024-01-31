package cliniс.stuff;

import cliniс.patient.Patient;
import cliniс.service.Fabric;

public class Therapist extends Doctor {
    public Therapist(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void traet() {
        System.out.println("лечит терапевт " + this.surname + " " + this.name + "\n");
    }

    public static void appointDoctor(Patient patient) {
        patient.setDoctor(Fabric.chooseDoctor(patient));

    }
}
