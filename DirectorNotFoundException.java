public class DirectorNotFoundException extends Exception {

 public DirectorNotFoundException() //default constructor for error message
 {
  super("no movies with that director"); //error message to print out  
 }
 public DirectorNotFoundException(String aMsg)
 {
  super(aMsg);
 }
}