package homework_1_mz_kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Ex3Double {

    private List<Double> listOfDouble = new ArrayList<>();

    public Ex3Double(){
        insertList();
        displayResults();
    }
public void insertList(){
        for (int i = 0; i < 10; i++){ // dodajemy wartosci do listy
            listOfDouble.add(i+0.5);
            System.out.print(listOfDouble.get(i) + " ");
        }
}

public void displayResults(){
    System.out.println();
    double sum =  listOfDouble.get(0) + listOfDouble.get(listOfDouble.size()-1);
    System.out.println("suma to: " + sum);
    double iloczyn = listOfDouble.get(0) * listOfDouble.get(listOfDouble.size()-1);
    System.out.println("iloczyn to: " + iloczyn);
    double iloraz = listOfDouble.get(1) / listOfDouble.get(listOfDouble.size()-2);
    System.out.println("iloraz to: " + iloraz);
}
}
