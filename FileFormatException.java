public class FileFormatException extends Exception{

 public FileFormatException() //default constructor for error message
 {
  super("Line not formatted correctly, skipped"); //error message to print out  
 }
 public FileFormatException(String aMsg)
 {
  super(aMsg);
 }
}