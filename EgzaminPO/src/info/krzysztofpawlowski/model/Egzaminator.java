package info.krzysztofpawlowski.model;

public abstract class Egzaminator {

    public Pytanie odpowiedzNaPytanie(Pytanie pytanie) {
        pytanie.setOdpowiedz("foo");
        return pytanie;
    }

}
