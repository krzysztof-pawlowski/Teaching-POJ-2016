package info.krzysztofpawlowski;

import info.krzysztofpawlowski.model.OcenaRozwiazania;
import info.krzysztofpawlowski.model.ProwadzacyGrupe;
import info.krzysztofpawlowski.model.Rozwiazanie;
import info.krzysztofpawlowski.model.Student;
import info.krzysztofpawlowski.model.Wykladowca;
import info.krzysztofpawlowski.model.Zadanie;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ProwadzacyGrupe cwiczeniowiec1 = new ProwadzacyGrupe("JJ");

        List<ProwadzacyGrupe> prowadzacy = new LinkedList<>();
        prowadzacy.add(cwiczeniowiec1);

        Student student1 = new Student("Jan", "Kowalski", cwiczeniowiec1);
        Student student2 = new Student("Jan", "Nowak", cwiczeniowiec1);

        List<Student> studenci = new LinkedList<>();
        studenci.add(student1);
        studenci.add(student2);

        Wykladowca wykladowca = new Wykladowca();

        Zadanie zadanie = new Zadanie("tresc");

        List<Rozwiazanie> rozwiazania = wykladowca.przeprowadzEgzamin(studenci, zadanie);

        List<OcenaRozwiazania> oceny = wykladowca.dajDoSprawdzenia(rozwiazania, prowadzacy);


    }
}
