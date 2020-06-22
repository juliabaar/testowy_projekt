package homework_1_mz_kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Ex2ArrayList {
    // Utwórz listę ArrayList przechowującą liczby całkowite.
    //a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
    //b. Wyświetl pierwszy element zapisany w liście.
    //c. Wyświetl ostatni element zapisany w liście

    public static void numberList() {
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(7);
        listOfNumbers.add(4);
        listOfNumbers.add(9);
        System.out.println(listOfNumbers.get(0));
        System.out.println(listOfNumbers.get(2));
    }

    public static void main(String[] args) {
        numberList();
    }
}

