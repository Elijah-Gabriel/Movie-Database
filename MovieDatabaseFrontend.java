//Elijah Gabriel HW 10

import java.util.Scanner;
public class MovieDatabaseFrontend 
{
		public static void main(String[] args) 
		{

			MovieDatabase movieDB = new MovieDatabase();
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Welcome to the Movie Database");
			boolean quit = false;
			while(quit == false)
			{
				System.out.println("\nEnter 1 to Add a Movie\n" + "Enter 2 to Remove a Movie\n" + "Enter 3 to Sort movies (by title)\n" + "Enter 4 to Sort movies (by rating)\n" + "Enter 5 to Sort movies (by Box Office Gross)\n"
						           + "Enter 6 to Sort movies (by Director)\n" + "Enter 7 to Print to a Database file\n" + "Enter 8 to Read from a Database file\n" + "Enter 0 to Quit");
				int selection = keyboard.nextInt();
				keyboard.nextLine();
				
				switch(selection)
				{
				case 1: 
					System.out.println("Enter the name of the Movie");
					String name = keyboard.nextLine();
					System.out.println("Enter the year it was released");
					int year = keyboard.nextInt();
					System.out.println("Enter a rating, 1 to 5");
					int rating = keyboard.nextInt();
					System.out.println("Enter the Directors name");
					String director = keyboard.nextLine();
					keyboard.nextLine();
					System.out.println("Enter the Box Office Gross");
					double Gross = keyboard.nextDouble();
					movieDB.addMovie(new Movie(name,year,rating,director,Gross));			
					break;
				case 2:
					System.out.println("Enter the name of the movie you want removed");
					String aName = keyboard.nextLine();
					movieDB.removeMovie(aName);
					break;
				case 3: 
					System.out.println("Sorting by Title");
					movieDB.Titlesort();
					break;
				case 4: 
					System.out.println("Sorting by rating");
					movieDB.Titlesort(); 
					movieDB.Ratingsort();
					break;
				case 5:
					System.out.println("Sorting by Box Office Gross");
					movieDB.Titlesort(); 
					movieDB.Grosssort();
					break;
				case 6:
					System.out.println("Sorting by Director ");
					movieDB.Directorsort();
					break;							
				case 7:
					System.out.println("Enter name of file to write to");
					String aFileName = keyboard.nextLine();
					movieDB.writeMovieDBFile(aFileName);
					break;
				case 8: 
					System.out.println("Enter name of file to read");
					String fileName = keyboard.nextLine();
					movieDB.readMovieDBFile(fileName);
					break;
				case 0:
					quit=true;
					break;
				default: 
					System.out.println("Invalid choice");
					break;
				}
			}
			System.out.println("Good Bye");
			keyboard.close();
		}

	}
