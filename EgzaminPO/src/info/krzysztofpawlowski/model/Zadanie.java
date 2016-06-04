package info.krzysztofpawlowski.model;

import java.util.List;

/**
 * Created by Krzysztof Pawlowski on 03/06/16.
 */
public class Zadanie {

    private String tresc;
    private List<Pytanie> pytania;

    public Zadanie(String tresc) {
        this.tresc = tresc;
    }


}
