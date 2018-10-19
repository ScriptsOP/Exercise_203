
package bl;

public class KniffelEntry {
    private String spiel;
    private boolean wahl;
    private int punkte;

    public KniffelEntry(String spiel, boolean wahl, int punkte) {
        this.spiel = spiel;
        this.wahl = wahl;
        this.punkte = punkte;
    }

    public String getSpiel() {
        return spiel;
    }

    public boolean isWahl() {
        return wahl;
    }

    public int getPunkte() {
        return punkte;
    }
}
