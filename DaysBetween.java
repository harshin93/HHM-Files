package apps;

import java.util.Scanner;
public class DaysBetween {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day, month, year;
		System.out.println("Enter two Dates");
		System.out.println("Mordern Dates should not before " + Dates.MINYEAR);
		
		System.out.println("Enter First Date");
		month = sc.nextInt(); day = sc.nextInt(); year = sc.nextInt();
		Dates d1 = new Dates();
		
		System.out.println("Enter Second Date");
		month = sc.nextInt(); day = sc.nextInt(); year = sc.nextInt();
		Dates d2 = new Dates();
		
		if ((d1.getyear() <= Dates.MINYEAR) || d2.getyear() <= Dates.MINYEAR)
			System.out.println("Pre Mordern Date");
			else
			{
				System.out.println("Days Between");
				System.out.println(d1 + "and" + d2 + "is");
				System.out.println(Math.abs(d1.lilian() - d2.lilian()));
			}
			
			sc.close();

		
		

		
		
		
		
	}
		
}