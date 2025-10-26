public class Fizjo {
    private String imie;
    private String specjalizacja;

    public Fizjo(String imie, String specjalizacja) {
        this.imie = imie;
        this.specjalizacja = specjalizacja;
    }

    public void pomoc() {
        System.out.println(imie + " (" + specjalizacja + ") pomaga zawodnikom wrócić do formy.");
    }
}
