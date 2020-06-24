package homework3_sda_OPP;
// 8. Utwórz klasę Vet, która będzie miała metodę sayHello przyjmującą jako parametr obiekt
//klasy Cat i wypisującą powitanie dla tego kota, np. „Witaj Mruczek”.
// 9. W klasie Vet napisz metodę sayHello przyjmującą jako parametr obiekt klasy Dog i
//wypisującą powitanie dla tego psa, np. „Witaj Burek”.
// 10. Zamiast dwóch wersji metody sayHello napisz jedną, która będzie potrafiła przyjąć w
//parametrze obiekty klas Cat oraz Dog.
public class Vet {

    public void sayHello(Cat kitty){
        System.out.println("Witaj " + kitty.getName()); // .8
    }

    public void sayHello(Dog doggy){
        System.out.println("Witaj " + doggy.getName()); // .9
    }

    public void sayHello(Animals animal){
        System.out.println("Witaj " + animal.getName()); // .10 jak to jest połączone? Jak to wywołać w mainie?
    }

}
