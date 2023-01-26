package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		boolean leapYear;
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		if ((year % 4.0 == 0 && year % 100.0 != 0) || (year % 400.0 == 0))
			{
			leapYear = true;
			}
		else
			{
			leapYear = false;
			}
		System.out.println(year + " is a leap year: " + leapYear);
	}

}
