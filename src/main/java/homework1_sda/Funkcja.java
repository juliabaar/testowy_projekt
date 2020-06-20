package homework1_sda;

public class Funkcja {
   // Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y

    public static int suma(int liczba1, int liczba2){
        int suma = 0;
        for (int i = liczba1;  i <= liczba2; i++ ){
            suma +=i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int wynik = suma(1,10);
        System.out.println(wynik);
    }
}
