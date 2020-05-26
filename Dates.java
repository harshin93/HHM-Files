package apps;

public class Dates {
	protected int year, month, day ;
	public static final int MINYEAR = 1583;


	public Dates ()
{
		int Newyear = 0; int Newmonth = 0; int Newday = 0;
		year = Newyear; month = Newmonth; day = Newday;
}
public int getyear() {return year; }
public int getday() {return day;}
public int getmonth() {return month;}

public int lilian()
{
		return day;

}
public String toString()
{
	return (month + "/" + day + "/" + year +"/");
}


}