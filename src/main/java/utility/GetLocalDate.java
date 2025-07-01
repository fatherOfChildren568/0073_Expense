package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetLocalDate {

    // private constructor
    private GetLocalDate() {

    }

    // get date
    public static String getDate() {
        // get date momment
        LocalDateTime time = LocalDateTime.now();
        // create formart for date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // formart date now 
        String date = time.format(formatter);
        return date;
    }
}
