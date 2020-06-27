package homework_1_mz_OPP;

public class Main {
    public static void main(String[] args) {
        Person julia = new Person("Julia", "Baar", 19);
        Address adres = new Address("Morawskiego", "Poznan", "Polska", 23, 23);
        Person person2 = new Person("Julia", "Bar", 12, adres);
        julia.introduce();


        Engine silnik = new Engine(2000, 275,9);
        SportsCar bmw = new SportsCar("BMW", "i8","black",2,silnik);
        bmw.displaySportsCar();
        System.out.println(bmw.toString());
        bmw.setRadio("eska");
        System.out.println(bmw.getRadio());
        System.out.println(bmw.makeSound());






    }
}

