package homework_1_mz_kolekcje;

public class Ex1 {
// Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
//a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
//b. Wyświetl długość tablicy
//c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
//d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
//zapisz go ponownie w tablicy.
//e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.

    public static int[] insertTable(int length) {
        int tab[] = new int[length];
        for (int i = 0; i < tab.length; i++){
            tab[i] = i+1;
        }
        return tab;

    }
    public static void displayTab(int[] tab){
        System.out.println(tab.length);
        for (int liczba: tab){
            System.out.print("[ " + liczba + " ]");
        }

        }
        public static void multiplyAndDisplay(int[] tab){
        for (int i = 0; i < tab.length; i++){
            tab[i] = tab[i]*2;
            System.out.print("[ " + tab[i] + " ]");
        }
    }

    public static void main(String[] args) {
        int[] tab2 = insertTable(10);
        displayTab(tab2);
        System.out.println();
        multiplyAndDisplay(tab2);



    }
    }

