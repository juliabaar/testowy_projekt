package homework_1_mz_OPP;

// 20. Utwórz klasę Address. Dodaj do klasy pola street, city, country, flatNo, homeNo.
// 21.Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienia klasy Address (street, city, country, flatNo, homeNo)
public class Address {
    private String street;
    private String city;
    private String country;
    private int flatNo;
    private int homeNo;


    public Address(String ulica, String miasto, String panstwo, int nrMieszk, int nrDom) {
        this.street = ulica;
        this.city = miasto;
        this.country = panstwo;
        this.flatNo = nrMieszk;
        this.homeNo = nrDom;
    }
// .25
    public void setStreet(String ulica){
        this.street = ulica;
    }
    public void setCity(String miasto){
        this.city = miasto;
    }
    public void setCountry(String panstwo){
        this.country = panstwo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }
// 27.
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public int getHomeNo() {
        return homeNo;
    }
}

