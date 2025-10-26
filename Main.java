import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Lionel", "Messi", 10, "ŚPO", 15);
        Player p2 = new Player("Pedri", "González", 8, "Środkowy pomocnik", 5);
        Coach c1 = new Coach("Hansi", "Flick", 1, 12, "Ofensywny");
        Scout s1 = new Scout("Mateu", "Alemany", 3, 7);
        Fizjo f1 = new Fizjo("Dr. Lopez", "Rehabilitacja kolan");

        ArrayList<FootballPerson> osoby = new ArrayList<>();
        osoby.add(p1);
        osoby.add(p2);
        osoby.add(c1);
        osoby.add(s1);

        System.out.println("=== FC Barcelona 2025/26 - Personel ===");
        for (FootballPerson o : osoby) {
            o.showInfo();
            System.out.println("Wynagrodzenie: " + o.calculateSalary() + " €\n");
        }

        System.out.println("--- Dział medyczny ---");
        f1.pomoc();
    }
}
