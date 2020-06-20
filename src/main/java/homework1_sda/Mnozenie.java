package homework1_sda;

public class Mnozenie {
    // zad. 1
    public static void mnozenie(double x) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
    public static void main(String[] args) {
        mnozenie(3);

    }

}
