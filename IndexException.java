public class IndexException extends Exception{

 public IndexException() //default constructor for error message
 {
  super("Movie name not found"); //error message to print out  
 }
 public IndexException(String aMsg)
 {
  super(aMsg);
 }
}