package info.krzysztofpawlowski.model;

import java.util.List;

/**
 * Created by Krzysztof Pawlowski on 03/06/16.
 */
public class Student {

    private String imie;
    private String nazwisko;
    private ProwadzacyGrupe prowadzacyGrupe;

    private List<Egzaminator> egzaminatorzy;

    private Zadanie zadanie;

    public Student(String imie, String nazwisko, ProwadzacyGrupe prowadzacyGrupe, List<Egzaminator> egzaminatorzy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.prowadzacyGrupe = prowadzacyGrupe;
        this.egzaminatorzy = egzaminatorzy;
    }

    public Rozwiazanie rozwiazZadanie(Zadanie zadanie) {
        this.zadanie = zadanie;

        Rozwiazanie rozwiazanie = new Rozwiazanie();
        podpiszPrace(rozwiazanie);
        rozwiazEgzamin(zadanie, rozwiazanie);

        return rozwiazanie;
    }

    private void podpiszPrace(Rozwiazanie rozwiazanie) {
        rozwiazanie.setImieRozwiazujacego(imie);
        rozwiazanie.setNazwiskoRozwiazujacego(nazwisko);
        rozwiazanie.setInicjalyCwiczeniowca(prowadzacyGrupe.getInicjaly());
    }

    private void rozwiazEgzamin(Zadanie zadanie, Rozwiazanie rozwiazanie) {

    }
}
