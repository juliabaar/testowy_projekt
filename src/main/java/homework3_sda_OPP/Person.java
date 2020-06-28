package homework3_sda_OPP;

public class Person {

    private String name;
    private String surname;

    public Person(String imie, String nazwisko){
        this.name = imie;
        this.surname = nazwisko;
    }
// 2. zad. 2 sda Do klasy Person dodaj informację o płci.
    public void gender(){
        if (name.endsWith("a")){
            System.out.println("Kobieta");
        } else {
            System.out.println("Mężczyzna");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
