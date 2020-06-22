package homework_1_mz_kolekcje;


import java.util.PriorityQueue;
import java.util.Scanner;

// Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
//a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
//b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random
//z zakresu <1,100> i dodaj je do kolejki.
//c. Wyświetl kolejno liczby występujące w kolejce.
public class Ex6Queue {

    PriorityQueue<Integer> queue = new PriorityQueue<>();
    Scanner scanner = new Scanner(System.in);
    private int howManyNo;

    public Ex6Queue() {
        howManyNo = howManyNumber();
        randomNumber(howManyNo);
        displayNumbers();
    }


    public int howManyNumber() {
        System.out.println("Enter number of random numbers: ");
        return scanner.nextInt();
    }

    public void randomNumber(int numberNumbers) {
        for (int i = 0; i < numberNumbers; i++) { // nie podajemy size w warunku, więc nie ma <= żeby wyswietlalo o 1 element mniej
            int random = (int) (Math.random() * 100);
            queue.add(random);
        }
    }

    public void displayNumbers() { // czemu nie mozna uzywac pętli for
       int i = 0;
       while(!queue.isEmpty()){
            System.out.print("[ " + queue.poll() + " ]");
            i++;
        }

    }
}
