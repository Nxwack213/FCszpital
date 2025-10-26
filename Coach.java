public class Coach extends FootballPerson {
    private int lataDoswiadczenia;
    private String styl;

    public Coach(String imie, String nazwisko, int id, int lataDoswiadczenia, String styl) {
        super(imie, nazwisko, id);
        this.lataDoswiadczenia = lataDoswiadczenia;
        this.styl = styl;
    }

    @Override
    public void showInfo() {
        System.out.println("Trener: " + getImie() + " " + getNazwisko() +
                " | Styl: " + styl + " | Doświadczenie: " + lataDoswiadczenia + " lat");
    }

    @Override
    public double calculateSalary() {
        return 40000 + lataDoswiadczenia * 1000;
    }
}
