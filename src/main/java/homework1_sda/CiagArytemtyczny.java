package homework1_sda;

public class CiagArytemtyczny {
  /*
    Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie,różnicy ciągu
   */

    public static int[] ciag(int lenght, int firstElement, int r) {
        int[] tab = new int[lenght];
        int i = 0;
        int sum = firstElement;

        for (int number : tab) {
            tab[i] = sum;
            i++;
            sum += r;
        }
        return tab;
    }

    // zad. 8 czy ciag jest arytemtyczny
    //wzor: an = a1 + (n-1)*r     / 6(a2) = 3(a1) + (2-1)*3
    public static boolean czyArytemtyczny(int[] ciag) {
        boolean status = true;
        int correct = ((ciag[ciag.length - 1]) - ciag[0]) / (ciag.length - 1);  // r = (an - a1)/(n-1) an = 12 - a1 =3 / n=4 - 1
        // ciag.length = n
        for (int i = 1; i < ciag.length; i++) {
            int r = ciag[i] - ciag[i - 1];
            if (r != correct) status = false;
            break;

        }
        return status;
    }

    public static void main(String[] args) {
        int[] tablica = ciag(4, 3, 3);
        for (int number : tablica) {
            System.out.println(number);
        }
// zad. 8
        if (czyArytemtyczny(tablica)) {
            System.out.println("Jest to ciąg arytmetyczny");
        } else {
            System.out.println("Nie jest arytmetyczny");
        }
    }
}
