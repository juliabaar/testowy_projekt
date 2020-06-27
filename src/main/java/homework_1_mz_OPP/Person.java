package homework_1_mz_OPP;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 16. Utwórz klasę Person posiadającą pola name, surname, age.
// 17. Utwórz konstruktor bezparametrowy.
// 18. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienia klasy
//Person.
// 19. Dodaj metodę introduce wyświetlającą na konsoli imię oraz nazwisko osoby.

@AllArgsConstructor // dodaje nam automatycznie konstruktor z wszystkimi argumentami
@Getter // dodaje automatycznie settery
@Setter // dodaje automatycznie gettery

public class Person {

    private String name; // 16.
    private String surname;
    private int age;
    Address address;  // 22.

    public Person(){ // 17.

    }

    public Person(String n, String sur, int a){ // 18.
        this.name = n;
        this.surname = sur;
        this.age = a;
    }



  /*  public Person(String n, String sur, int a, Address InputAdress){ // 23. Utwórz nowy konstruktor przyjmujący wszystkie możliwe parametry do ustawienia
      //  klasy Person (name, surname, age oraz Address)
        this.name = n;
        this.surname = sur;
        this.age = a;
        this.address = InputAdress;
    }


   */
    public void introduce(){
        System.out.println(name);
        System.out.println(surname);

    }
// 24.
   /* public void setName(String imie){
        this.name = imie;
    }
    public void setSurname(String nazwisko){
        this.surname = nazwisko;
    }
    public void setAge(int age) {
        this.age = age;
    }
// .26
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }




    */


}
