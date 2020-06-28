package homework3_sda_OPP;

import lombok.Getter;
import lombok.Setter;

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

    public Complex(double v, double v1){
        this.re = v;
        this.im = v1;
    }

    public void displayNumber(){
        System.out.println(re + "+" + im + "*i" );

    }

    public static void add(Complex number1, Complex number2) {
        double sumRe = number1.getRe() + number2.getRe();
        double sumIm = number1.getIm() + number2.getIm();
        if (sumIm == 0) {
            System.out.println(sumRe);
        } else {
            System.out.println(sumRe + "+" + sumIm + "*i");
        }
    }


    public static void main(String[] args) {
        Complex a = new Complex(1,0);
        Complex b = new Complex(4,-2);
       a.displayNumber();
       b.displayNumber();
       add(a,b);
    }

}
