package homework1_sda;

public class Modulo {
    //zad 9. Załóżmy, że nie wiesz, że istnieje operator %, a potrzebujesz wylicz resztę z dzielenia
    //  dwóch liczb. Napisz własną wersję funkcji modulo.

    public static int modulo(int x, int y) {
        int wynik = (int) x / y;
        return x - (wynik * y);
    }
// zad. 10
    public static boolean isModulo(int modulo, int x, int y) {
        boolean isSame = true;
        int wynikModulo = x % y;
        if (wynikModulo != modulo) isSame = false;
        return isSame;
    }

    public static void main(String[] args) {
        int modulo = modulo(5, 3);
        System.out.println(modulo);
        if (isModulo(modulo, 5, 3)) {
            System.out.println("Formuła jest poprawna i zwraca takie same wartości");
        } else {
            System.out.println("Wyniki są różne");
        }

    }
}

