//Elijah Gabriel HW 10
import java.util.Scanner;
import java.io.*;

public class MovieDatabase 
{
		
		private Movie[] movies;
		public static final int MOVIE_SIZE = 30; 
		public static final String delim = "\t";
		public static final int FIELD_AMT = 5;
		
		public MovieDatabase()
		{
			movies = new Movie[MOVIE_SIZE];
		}
		public Movie[] getMovie()
		{
			return this.movies;
		}

		public void addMovie(Movie aMovie)
		{
			for (int i=0; i<MOVIE_SIZE;i++) 
			{
				if (movies[i]==null)
				{
					movies[i] = aMovie;
					break;
				}
			}
		}
		
		public void removeMovie(String aName) 
		{
				int removeIndex = -1; 
				for (int i=0; i<movies.length;i++)
				{
					if (movies[i].getName().equals(aName))
					{
						removeIndex = i;  
						break;
					}
				else if(movies[i]==null)
					{
						System.out.println("Movie was not found");
						break;
					}
				}
				if (removeIndex == -1) 
				{
					System.out.println("Something is wrong");
				}
				else 
				{
					for (int i=removeIndex;i<movies.length-1;i++)
					{
						movies[i] = movies[i+1];
					}
					movies[movies.length-1] = null; 
					System.out.println("Movie was removed");	
				}
				
			}
		
		public void Titlesort() 
		{
			boolean swapped = true;
			while(swapped == true)
			{
				swapped = false;
				for(int i=0;i<MOVIE_SIZE-1;i++)
				{
					if(movies[i+1]==null)
					{
						break;
					}
					if(movies[i].getName().charAt(i)>movies[i+1].getName().charAt(i)); //how to sort by title? I think this works?
					{
						Movie temp = movies[i];
						movies[i] = movies[i+1];
						movies[i+1] = temp;
						swapped = true;
					}
				}
			}
		}
		 
		public void Ratingsort() 
		{
			boolean swapped = true;
			while(swapped == true)
			{
				swapped = false;
				for(int i=0;i<MOVIE_SIZE-1;i++)
				{
					if(movies[i+1]==null)
					{
						break;
					}
					if(movies[i].getRating() >  movies[i+1].getRating())
					{
						Movie temp = movies[i];
						movies[i] = movies[i+1];
						movies[i+1] = temp;
						swapped = true;
					}
				}
			}
		}
		
		public void Grosssort()
		{
			boolean swapped = true;
			while(swapped == true)
			{
				swapped = false;
				for(int i=0;i<MOVIE_SIZE-1;i++)
				{
					if(movies[i+1]==null)
					{
						break;
					}
					if(movies[i].getGross()>movies[i+1].getGross())
					{
						Movie temp = movies[i];
						movies[i] = movies[i+1];
						movies[i+1] = temp;
						swapped = true;
					}
				}
			}
		}
		
		public void Directorsort() 
		{
			boolean swapped = true;
			while(swapped == true)
			{
				swapped = false;
				for(int i=0;i<movies.length-1;i++)
				{
					if(movies[i+1]==null)
					{
						break;
					}
					if(movies[i].getDirector().charAt(i)>movies[i+1].getDirector().charAt(i)); //How to sort by director? I think this should work
					{
						Movie temp = movies[i];
						movies[i] = movies[i+1];
						movies[i+1] = temp;
					
						swapped = true;
					
					}
				}
			}
			
		}
		
		public void writeMovieDBFile(String aFileName)
		{
			try
			{
				PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFileName));
				for (int i=0;i<MOVIE_SIZE;i++)
				{
					if (movies[i] != null)
					{
						fileWriter.println(movies[i].getName()+delim+movies[i].getYear()+delim+
								movies[i].getRating()+delim+movies[i].getDirector()
								+delim+movies[i].getGross());
					}
					else if(movies[i] == null)
					{
						break;
					}
					
				}
			fileWriter.close();
			} 
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		public void readMovieDBFile(String fileName)
		{
			try
			{
				movies = new Movie[MOVIE_SIZE];
				Scanner fileScanner = new Scanner(new File(fileName));
				while (fileScanner.hasNextLine())
				{
					String fileLine = fileScanner.nextLine();
					String[] splitLines = fileLine.split(delim);
					if (splitLines.length == FIELD_AMT)
					{
						String name = splitLines[0];
						int year = Integer.parseInt(splitLines[1]);
						int rating = Integer.parseInt(splitLines[2]);
						String director = splitLines[3];
						double Gross = Double.parseDouble(splitLines[4]);
						Movie aMovie = new Movie(name,year,rating,director,Gross);
						
						this.addMovie(aMovie);
					}
					else 
					{
						System.out.println("Can't add");
					}
				}
				fileScanner.close();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
