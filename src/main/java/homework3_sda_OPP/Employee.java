package homework3_sda_OPP;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

// 15. Utwórz klasę Employee dziedziczącą po klasie Person. Dlaczego klasa jest podkreślona na
//czerwono? - bo w klasie Person nie bylo konstruktora bezparametrowego
//16. Zmodyfikuj klasę Employee w taki sposób, żeby przy podaniu roku urodzenia z zakresu
//innego niż 1900-2020 ustawiało rok urodzenia na 0.


public class Employee extends Person {

    private int yearOfBirth;
    private double salary;

    public Employee(String imie, String nazwisko, int rokUrodzenia) {
        super(imie, nazwisko);
        this.yearOfBirth = dateOfBirth(rokUrodzenia); //16.
        this.salary = 1000.00;
    }

    public int dateOfBirth(int rokUrodzenia){ //16.
        if (1900 < rokUrodzenia && rokUrodzenia < 2020){
            return rokUrodzenia;
        } else {
            return 0;
        }
    }
  // //17. Do klasy Employee dodaj pole salary oraz metodę getSalary. Zrób tak, aby metoda whoAmI
  ////dla pracownika wyświetlała tekst „Nazywam się Jan Kowalski i zarabiam 1000zł”
    public void whoIAm(){
        System.out.println("Nazywam się " + getName() +  " " + getSurname() + " i zarabiam " + getSalary() + " zł");
    }

    public double getSalary(){
        return this.salary;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
