public class Surgeon extends Doctor{
    public Surgeon(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void traet() {
        System.out.println("лечит хирург " + this.surname + " " + this.name + "\n");
    }
}
