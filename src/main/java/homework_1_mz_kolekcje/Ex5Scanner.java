package homework_1_mz_kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5Scanner {
   // Utwórz tablicę ArrayList przechowującą imiona
   //a. Korzystając z klasy Scanner pobierz od użytkownika 5 imion i zapisz je w
   //liście.
   //b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w
   //liście.
    private List<String> listOfNames = new ArrayList<>();

    public Ex5Scanner(){
        loadNames();
        displayNames();
    }

    public void loadNames(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, press 'enter' to enter next, total number of names: 5");
        String firstN = scanner.next();
        String secondN = scanner.next();
        String thirdN = scanner.next();
        String fourthN = scanner.next();
        String fithN = scanner.next();
        listOfNames.add(firstN);
        listOfNames.add(secondN);
        listOfNames.add(thirdN);
        listOfNames.add(fourthN);
        listOfNames.add(fithN);

    }

    public void displayNames(){
        int i = 0;
        while (i < listOfNames.size()){
            System.out.print("[ " + listOfNames.get(i) + " ]");
            i++;
        }
    }
}
