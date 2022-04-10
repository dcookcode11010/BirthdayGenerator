package generator;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 

public class input 
{
	int month;
	int day;
	int year;

	public input()
	{
		this.month = getMonth();
		this.day = getDay();
		this.year = getYear();
		
	}
	
	void printDate()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		
		if (month == 1 && day <= 31 && year <= 2023)
			System.out.println("January " + day + ", " + year);
		else if (month == 2 && day <= 28 && year <= 2023)
			System.out.println("Febuary " + day + ", " + year);
		else if (month == 3 && day <= 31 && year <= 2023)
			System.out.println("March " + day + ", " + year);
		else if (month == 4 && day <= 30 && year <= 2023)
			System.out.println("April " + day + ", " + year);
		else if (month == 5 && day <= 30 && year <= 2022)
			System.out.println("May " + day + ", " + year);
		else if (month == 6 && day <= 30 && year <= 2022)
			System.out.println("June " + day + ", " + year);
		else if (month == 7 && day <= 31 && year <= 2022)
			System.out.println("July " + day + ", " + year);
		else if (month == 8 && day <= 31 && year <= 2022)
			System.out.println("August " + day + ", " + year);
		else if (month == 9 && day <= 30 && year <= 2022)
			System.out.println("September " + day + ", " + year);
		else if (month == 10 && day <= 31 && year <= 2022)
			System.out.println("October " + day + ", " + year);
		else if (month == 11 && day <= 30 && year <= 2022)
			System.out.println("November " + day + ", " + year);
		else if (month == 12 && day <= 31 && year <= 2022)
			System.out.println("December " + day + ", " + year);
		else
		{
			System.out.println("The information you added was invalid," + " Please make sure your DOB is after: " + dtf.format(now));
		}
	}
	public int getMonth()
	{
		Scanner mon = new Scanner(System.in);
		System.out.println("Please enter the number your birth month: \n");
		
		int month = mon.nextInt();
		
		return month;
	}
	public int getDay()
	{
		Scanner da = new Scanner(System.in);
		System.out.println("Please enter the number your birth day: \n");
		
		int day = da.nextInt();
		
		return day;
	}
	public int getYear()
	{
		Scanner yea = new Scanner(System.in);
		System.out.println("Please enter the number your birth year: \n");
		
		int year = yea.nextInt();
		
		return year;
	}

}
