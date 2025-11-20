import java.time.LocalDateTime; // import the LocalDate class
import java.time.format.DateTimeFormatter;

public class Time {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);

    DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    String formattedDate = myObj.format(myFormat);

    System.out.println(formattedDate);

    /*  
    yyyy-MM-dd ->   "1988-09-29"	
    dd/MM/yyyy ->	"29/09/1988"	
    dd-MMM-yyyy ->	"29-Sep-1988"	
    E, MMM dd yyyy ->	"Thu, Sep 29 1988" 
    */
  }
}
