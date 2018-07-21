//Elijah Gabriel HW 10
public class Movie 
{
	private String name;
	private int year;
	private int rating;
	private String director;
	private double Gross;
	
	public Movie()
	{
		this.name = "None";
		this.year = 0;
		this.rating = 0;
		this.director = "None";
		this.Gross = 0.0;
	}
	public Movie(String aName, int aYear, int aRating, String aDirector, double aGross)
	{
		this.name = aName;
		this.setYear(aYear);  
		this.setRating(aRating);
		this.director = aDirector;
		this.Gross = aGross;
	}
	public String getName()
	{
		return this.name;
	}
	public int getYear()
	{
		return this.year;
	}
	public int getRating()
	{
		return this.rating;
	}
	public String getDirector()
	{
		return this.director;
	}
	public double getGross()
	{
		return this.Gross;
	}
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setYear(int aYear)
	{
		if (aYear<=2018)
		{
			this.year = aYear;
		}
		else 
		{
			System.out.println("Are you a time traveler? That date doesn't exist yet.");
		}
	}
	public void setRating(int aRating)
	{
		if (aRating >= 1 || aRating <= 5)
		{
			this.rating = aRating;
		}
		else
		{
			System.out.println("Invalid Rating");
		}
	}
	public void setDirector(String aDirector)
	{
		this.director = aDirector;
	}
	public void setGross(double aGross)
	{
		this.Gross = aGross;
	}
}
