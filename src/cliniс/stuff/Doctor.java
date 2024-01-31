package cliniс.stuff;

public abstract class Doctor {
    protected String name;
    protected String surname;

    public Doctor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void traet();
}
