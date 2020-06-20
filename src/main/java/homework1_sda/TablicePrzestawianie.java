package homework1_sda;

public class TablicePrzestawianie {
    /*  Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
              Przykład:
      zadana tablica [12, 7, 19]
      wynik [19, 7, 12]

     */

    public static void changePlace(int[] tablica) {
        if (tablica.length != 3) {
            System.out.println("Podaj tablicę 3 elementową");
        } else {

            int zero = tablica[0];
            int ostatnia = tablica[2];

            tablica[0] = ostatnia;
            tablica[2] = zero;

            for (int liczba : tablica) {
                System.out.print(liczba + " ");
            }

        }
    }


    public static void main(String[] args) {
        int[] tab = {12, 7, 19};

        changePlace(tab);
    }

}
