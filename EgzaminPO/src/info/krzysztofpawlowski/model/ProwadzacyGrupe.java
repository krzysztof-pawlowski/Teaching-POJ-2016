package info.krzysztofpawlowski.model;

/**
 * Created by Krzysztof Pawlowski on 03/06/16.
 */
public class ProwadzacyGrupe extends Egzaminator {

    private String inicjaly;

    public ProwadzacyGrupe(String inicjaly) {
        this.inicjaly = inicjaly;
    }

    public String getInicjaly() {
        return inicjaly;
    }

    public void setInicjaly(String inicjaly) {
        this.inicjaly = inicjaly;
    }
}
