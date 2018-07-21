public class YearException extends Exception{
 public YearException() //default constructor for error message
 {
  super("Invalid year (>2015)"); //error message  
 }
 public YearException(String aMsg)
 {
  super(aMsg);
 }

}