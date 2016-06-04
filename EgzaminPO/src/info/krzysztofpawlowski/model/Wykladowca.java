package info.krzysztofpawlowski.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Krzysztof Pawlowski on 03/06/16.
 */
public class Wykladowca extends Egzaminator {

    public List<Rozwiazanie> przeprowadzEgzamin(List<Student> studenci, Zadanie zadanie) {
        List<Rozwiazanie> rozwiazania = new LinkedList<>();
        for (Student student : studenci) {
            Rozwiazanie rozwiazanie = student.rozwiazZadanie(zadanie);
            rozwiazania.add(rozwiazanie);
        }
        return rozwiazania;
    }

    public List<OcenaRozwiazania> dajDoSprawdzenia(List<Rozwiazanie> rozwiazania, List<ProwadzacyGrupe> prowadzacy) {

    }

}
