package info.krzysztofpawlowski.model;

public class Egzaminator {

    public Pytanie odpowiedzNaPytanie(Pytanie pytanie) {
        pytanie.setOdpowiedz("foo");
        return pytanie;
    }

}