package cliniс.stuff;

public class Dentist extends Doctor{
    public Dentist(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void traet() {
        System.out.println("лечит дантист " + this.surname + " " + this.name + "\n");
    }

}
