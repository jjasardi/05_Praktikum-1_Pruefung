import java.util.Random;

/**
 * Simuliert Pruefungsergebnisse zum Testen der Pruefungsverwaltung.
 */
public class ZufaelligeNotengebung {

  /**
   * Fuehrt die Simulation aus.
   */
  public void fuehreAus() {
    Pruefungsverwaltung pruefungsverwaltung = new Pruefungsverwaltung();
    String nameBestanden = "Max Muster ";
    String nameNichtBestanden = "Felix Müller ";
    for (int i = 0; i < 3; i++) {
      double note = generiereZufaelligePruefungsnoteFuerBestanden();
      Pruefungsergebnis pruefungsergebnis = new Pruefungsergebnis(nameBestanden + i, note);
      pruefungsverwaltung.speichereErgebnis(pruefungsergebnis);
      note = generiereZufaelligePruefungsnoteFuerNichtBestanden();
      pruefungsverwaltung.speichereErgebnis(new Pruefungsergebnis(nameNichtBestanden + i, note));
    }
    pruefungsverwaltung.druckeAntworttexte();
  }

  private double generiereZufaelligePruefungsnoteFuerBestanden() {
    // TODO: Fehlenden Code hier einfuegen
    return 0;
  }

  private double generiereZufaelligePruefungsnoteFuerNichtBestanden() {
    // TODO: Fehlenden Code hier einfuegen
    return 0;
  }

  private void fuehreAufgabe3Aus() {
    Pruefungsverwaltung verwaltung = new Pruefungsverwaltung();
    verwaltung.speichereErgebnis(new Pruefungsergebnis("Susi Muster", 5.3333));
    verwaltung.speichereErgebnis(new Pruefungsergebnis("Max Mueller", 3.74));
    verwaltung.speichereErgebnis(new Pruefungsergebnis("Heinz Moser", 4));
    verwaltung.druckeAntworttexte();
  }
}
