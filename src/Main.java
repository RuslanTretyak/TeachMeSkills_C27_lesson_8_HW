public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Иван", "Иванов", 1);
        System.out.println("пациент " + patient1.getSurname() + " " + patient1.getName() + ":");
        Therapist.appointDoctor(patient1);
        patient1.getDoctor().traet();

        Patient patient2 = new Patient("Алексей", "Алексеев", 2);
        System.out.println("пациент " + patient2.getSurname() + " " + patient2.getName() + ":");
        Therapist.appointDoctor(patient2);
        patient2.getDoctor().traet();

        Patient patient3 = new Patient("Пётр", "Пертов", 3);
        System.out.println("пациент " + patient3.getSurname() + " " + patient3.getName() + ":");
        Therapist.appointDoctor(patient3);
        patient3.getDoctor().traet();

    }
}
