import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Trim {
    public static void main(String[] args) {
        LocalDateTime myDT = LocalDateTime.now();
        System.out.println(myDT);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDT.format(myFormatObj);
        System.out.println( "Adter formatting:"+formattedDate );
        Trim t1 = new Trim();
        System.out.println(t1);

    }
    
}
