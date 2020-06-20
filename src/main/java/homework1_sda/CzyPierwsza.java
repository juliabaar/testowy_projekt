package homework1_sda;

public class CzyPierwsza {

    public static boolean czyPierwsza(int liczba) {
        boolean pierwsza = true;
        if (liczba < 2)
            pierwsza = false;

        for (int i = 2; i < liczba; i++) { // liczby pierwsze dziela sie tylko przez siebie i przez 1
            if (liczba % i == 0) { // czyli jesli jest podzielan przez jakakolwiek mniejsza od siebie to nie jest pierwsza!
                pierwsza = false;
            }
        }
        return pierwsza;

    }

    public static void main(String[] args) {

        if (czyPierwsza(35)) {
            System.out.println("Jest to liczba pierwsza");
        } else {
            System.out.println("Nie jest to liczba pierwsza");
        }
    }
}
