public class RatingException extends Exception{

 public RatingException() //default constructor for error message
 {
  super("Invalid Rating (<5 || <1)"); //error message 
 }
 public RatingException(String aMsg)
 {
  super(aMsg);
 }
 
}