public class Player extends FootballPerson {
    private String pozycja;
    private int gole;

    public Player(String imie, String nazwisko, int id, String pozycja, int gole) {
        super(imie, nazwisko, id);
        this.pozycja = pozycja;
        this.gole = gole;
    }

    public String getPozycja() { return pozycja; }
    public void setPozycja(String pozycja) { this.pozycja = pozycja; }

    public int getGole() { return gole; }
    public void setGole(int gole) { this.gole = gole; }

    @Override
    public void showInfo() {
        System.out.println("Piłkarz: " + getImie() + " " + getNazwisko() +
                " | Pozycja: " + pozycja + " | Gole: " + gole);
    }

    @Override
    public double calculateSalary() {
        return 20000 + gole * 1500;
    }
}
