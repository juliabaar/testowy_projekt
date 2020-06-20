package homework1_sda;

public class MinMax {

    //Dla zadanej tablicy intów wyświetl najmniejszą oraz największą liczbę z tablicy

    public static void minMax(int[] tab) {

        int min = tab[0];
        int max = tab[0];

        for (int liczba : tab) {
            if (liczba > max) {
                max = liczba;

            }
            if (liczba < min) {
                min = liczba;

            }
        }
        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);
    }


    public static void main(String[] args) {
        int[] tablica = {1, 2, 40, 0, 2};

        minMax(tablica);

    }
}
