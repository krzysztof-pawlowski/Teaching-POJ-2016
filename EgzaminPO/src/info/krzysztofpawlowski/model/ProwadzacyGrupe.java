package info.krzysztofpawlowski.model;

/**
 * Created by Krzysztof Pawlowski on 03/06/16.
 */
public class ProwadzacyGrupe extends Egzaminator {

    private String inicjaly;
    private Wykladowca wykladowca;

    public ProwadzacyGrupe(String inicjaly, Wykladowca wykladowca) {
        this.inicjaly = inicjaly;
        this.wykladowca = wykladowca;
    }

    public String getInicjaly() {
        return inicjaly;
    }

    public void setInicjaly(String inicjaly) {
        this.inicjaly = inicjaly;
    }

    @Override public Pytanie odpowiedzNaPytanie(Pytanie pytanie) {
        if (pytanie.getPytanie().length() % 2 == 0) {
            pytanie.setOdpowiedz("foo");
            return pytanie;
        } else {
            return wykladowca.odpowiedzNaPytanie(pytanie);
        }
    }
}
