package homework_1_mz_OPP;

public class Main {
    public static void main(String[] args) {
        Person julia = new Person("Julia", "Baar", 19);
        julia.introduce();
        Engine silnik = new Engine(7, 8,5);
        SportsCar bmw = new SportsCar("BMW", "i8","black",2,silnik);
        bmw.displaySportsCar();




    }
}

