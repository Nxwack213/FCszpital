public class Scout extends FootballPerson {
    private int liczbaOdkrytychTalentow;

    public Scout(String imie, String nazwisko, int id, int liczbaOdkrytychTalentow) {
        super(imie, nazwisko, id);
        this.liczbaOdkrytychTalentow = liczbaOdkrytychTalentow;
    }

    @Override
    public void showInfo() {
        System.out.println("Skaut: " + getImie() + " " + getNazwisko() +
                " | Odkryte talenty: " + liczbaOdkrytychTalentow);
    }

    @Override
    public double calculateSalary() {
        return 18000 + liczbaOdkrytychTalentow * 1200;
    }
}
