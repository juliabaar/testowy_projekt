package homework1_sda;

public class UjemneTablica {
    // Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
    // utwórz nową tablicę, do której przepisze tylko te ujemne liczby

    public static int ileUjemnych(int[] tab) {
        int count = 0;
        for (int liczba : tab) {
            if (liczba < 0) {   // ile razy pojawia się wartość ujemna
                count++;
            }
        }
        return count;
    }

    public static int[] nowaTablica(int count, int[] tab) {
        int[] nowa = new int[count];
        int i = 0;

        for (int liczba : tab) {
            if (liczba < 0) {
                nowa[i] = liczba; // inicjowanie tablicy wartości ujemnymi
                i++;
            }
        }

        return nowa;
    }

    public static void main(String[] args) {
        int[] tablica = {-1, 0, 3, 5, -2,-5};
        int lUjemnych = ileUjemnych(tablica);
        System.out.println("Liczba ujemnych cyfr w tablicy to: " + lUjemnych);
        int[] tablicaUjemna = nowaTablica(lUjemnych, tablica);
        for (int liczba : tablicaUjemna) {
            System.out.print(liczba + " ");

        }
    }
}
