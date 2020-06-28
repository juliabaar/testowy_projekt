package homework3_sda_OPP;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

// 3. Napisz klasę Complex do obsługi liczb zespolonych. Klasa powinna posiadać:
//a) Konstruktor
//b) Drugi konstruktor dla przypadku, gdy część urojona jest równa zero
//c) Metodę print wypisującą liczbę w postaci a + b*i (pamiętaj o przypadkach, gdy część
//urojona jest równa zero lub mniejsza od zera)


@Getter
@Setter
public class Complex {
    private double re;
    private double im;
    private String i;

    public Complex(double v, double v1) {
        this.re = v;
        this.im = v1;
        this.i = "*i";
    }

    public void displayNumber() {
        System.out.println(re + "+" + im + "*i");

    }

    // 4. Zamiast metody print nadpisz metodę toString.
    @Override
    public String toString() {
        return "Complex{" +
                "re=" + re +
                ", im=" + im +
                ", i='" + i + '\'' +
                '}';
    }

    //7. Napisz metodę, która dodaje dwie liczby zespolone.
    public static void add(Complex number1, Complex number2) {
        double sumRe = number1.getRe() + number2.getRe();
        double sumIm = number1.getIm() + number2.getIm();
        if (sumIm == 0) {
            System.out.println(sumRe);
        } else {
            System.out.println(sumRe + "+" + sumIm + "*i");
        }
    }

    // 9. Napisz metodę, która dodaje trzy liczby zespolone.
    public static void add3(Complex number1, Complex number2, Complex number3) {
        double sumRe = number1.getRe() + number2.getRe() + number3.getRe();
        double sumIm = number1.getIm() + number2.getIm() + number3.getIm();
        if (sumIm == 0) {
            System.out.println(sumRe);
        } else {
            System.out.println(sumRe + "+" + sumIm + "*i");
        }
    }

    //10. Napisz metodę, która dodaje dowolną ilość liczb zespolonych.
    public static void addVar(Complex... numbers) {
        double sumRe = 0;
        double sumIm = 0;
        for (Complex element : numbers) {
            sumRe += element.getRe();
            sumIm += element.getIm();
        }
        System.out.println(sumRe + "+" + sumIm + "*i");
    }

    // 11. Napisz metodę, która zwróci ile zostało już utworzonych liczb zespolonych.
    public static int howManyNumbers(Complex... numbers) {
        int count = 0;

        for (Complex element : numbers) {
            count++;
        }
        return count;


    }

    //5.  Do klasy Complex dopisz metodę isEqualTo, która sprawdzi, czy bieżący obiekt ma takie
////same części rzeczywistą i urojoną jak liczba przekazana w parametrze tej funkcji.
    public boolean isEqualTo(Complex i) {
        boolean status;
        if (re == i.re && im == i.im) {
            return status = true;
        } else {
            return status = false;
        }
    }

    // 6. Zamiast metody isEqualTo nadpisz metodę equals.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.re, re) == 0 &&
                Double.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public static void main(String[] args) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(4, -2);
        Complex c = new Complex(1, 2);
        a.displayNumber();
        b.displayNumber();
        a.toString(); // czemu ignorowana ?
        add(a, b);
        System.out.println(a.isEqualTo(b)); // 5.
        System.out.println(a.isEqualTo(c)); // 5.
        System.out.println(a.equals(c)); //6.
        add3(a, b, c);
        addVar(a, b, c);
        System.out.println(howManyNumbers(a, b, c));
    }

}
