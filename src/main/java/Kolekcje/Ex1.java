package Kolekcje;

import java.util.*;

public class Ex1 {

    public static void exList() {
        List<String> listOfNames = new ArrayList<String>(); // gdy typ nie jest podany po new to domyslnie jest to co przez =
        listOfNames.add("Julia");
        listOfNames.add("Adam");
        listOfNames.add("Ola");
        System.out.println("size before: " + listOfNames.size());
        listOfNames.add("Maciek");
        System.out.println("seize before: " + listOfNames.size());
    }
        public static void exSet(){
            Set<String> setofNames = new HashSet<String>();
            setofNames.add("Julia");
            setofNames.add("Ola");
            setofNames.add("Maja");
            System.out.println("size before: " + setofNames.size());
            setofNames.add("Maja");
            System.out.println("size now: " + setofNames.size()); // dodajemy to samo imie, więc z uwagi na kolekcje Set nie doda się taka sama zmienna
        }

        public static void exMap(){
        Map<Integer,String> mapOfNames = new HashMap<Integer, String>(); // wylicza liczbe ktora wylicza czy to indywidualny obiekt (hashMap)
        mapOfNames.put(1,"Julia"); // put == add
        mapOfNames.put(2,"Maja");
        mapOfNames.put(3,"Maciej");
            System.out.println("size before: " + mapOfNames.size());
            mapOfNames.put(3, "Maciej");
            System.out.println("size after adding same key&value: " + mapOfNames.size());
            mapOfNames.put(4,"Maciej");
            System.out.println("size after adding different key& same value: " + mapOfNames.size());
            mapOfNames.put(4,"Adam"); // pod klucz nr 4 aktualizuje sie imie na Adam
            System.out.println("size after adding same key & different value: " + mapOfNames.size());
            System.out.println(mapOfNames.get(4)); // zwracamy wartosc z klucza 4


        }

    public static void main(String[] args) {
        exList();
        System.out.println();
        exSet();
        System.out.println();
        exMap();

    }
    }




