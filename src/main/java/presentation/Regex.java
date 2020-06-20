package presentation;

import java.util.regex.Pattern;

public class Regex {

    public static boolean isidCorrect(String pesel){
        Pattern peselPattern = Pattern.compile("[0-9]{11}");
        return peselPattern.matcher(pesel).matches();
    }

    public static boolean isEmailCorrect(String email){
        Pattern emailPattern = Pattern.compile("[0-9a-zA-Z_\\.\\_\\$]+@[0-9a-z_\\.\\_]+"); // dwa "\\" bo w kodzie ma on znaczenie inne, wiec jak jest jeden "\" nie sluzy jako odwolanie tylko jako jakas operacja
        return emailPattern.matcher(email).matches();
    }

    public static boolean isPasswordCorrect(String haslo){
        Pattern hasloPattern = Pattern.compile("[a-zA-Z\\$]{9}");
        return hasloPattern.matcher(haslo).matches();
    }

    public static void main(String[] args) {
        System.out.println("Pesel czy poprawny " + isidCorrect("95010101028"));
        System.out.println("Pesel czy poprawny " + isidCorrect("242"));
        System.out.println("Email czy poprawny " + isEmailCorrect("julia$@gmail.com"));
        System.out.println("Email czy poprawny " + isEmailCorrect("JULiiiia.$@gmail.com"));
        System.out.println("Haslo " + isPasswordCorrect("hasLo$asa"));
    }
}
