package homework1_mz_DataiCzas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// 14. Wyświetl bieżącą datę i godzinę w Tokyo.
// 15.  Wyświetla bieżącą godzinę w Bydgoszczy. Wykorzystaj DateTimeFormatter aby
//wyświetlić datę w następującym formacie
//
//3 lutego 2018 roku, sobota 22:12:27
public class Ex14Ex15 {
    public static void main(String[] args) {


    LocalDateTime tokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("W Tokyo jest: " + tokyo);

        LocalDateTime bdg = LocalDateTime.now();

        DateTimeFormatter bydgoszcz = DateTimeFormatter.ofPattern( ", dd MMMM yyyy 'roku,' EEEE hh:mm:ss ", new
                Locale(
                "pl" ));

        String displayBydgoszcz = bdg.format(bydgoszcz);
        System.out.println(displayBydgoszcz);


}
    }