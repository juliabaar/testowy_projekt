package homework_1_mz_kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Utwórz listę ArrayList przechowującą imiona.
//a. Dodaj 5 imion do listy,
//b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
//c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
//zaczynając od ostatniego, a kończąc na pierwszym.
public class Ex4Names {
    private List<String> listOfNames = new ArrayList<>();

    public Ex4Names(){
        addNames();
        displayNames();
        System.out.println();
        displatNamesBackwords();
        Collections.reverse(listOfNames); // łatwe odwracania kolekcji!
        System.out.println(listOfNames); // łatwe odwracanie kolekcji
    }

    public void addNames(){
        listOfNames.add("Adam");
        listOfNames.add("Ania");
        listOfNames.add("Arek");
        listOfNames.add("Adi");
        listOfNames.add("Ala");

    }

    public void displayNames() {
      //  for (int i = 0; i < listOfNames.size(); i++) {
      //      System.out.print(listOfNames.get(i) + " ");
       // }

        for (String element: listOfNames) { // lista stringów, element bierze sobie kolejny obiekt, to samo co wyzej!
            System.out.println(element);
        }
    }
        public void displatNamesBackwords(){
        for (int i = listOfNames.size()-1; i >= 0; i--){
            System.out.print(listOfNames.get(i) + " ");

        }
    }

}
