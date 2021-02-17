	public class Date{

		private int month;
		private int day;
		private int year;
		

	public Date(int day, int month, int year){
		if(day > 0)
		if(day < 31)
		this.day = day;
		
		if(month > 0)
		if(month < 12)
		this.month = month;
		this.year = year;
		}
		

	public void setDay(int day){
		this.day = day; }

	public int getDay(){
	
		return day;}

	public void setMonth(int month){
		this.month = month; }

	public int getMonth(){

		return month; }
		

		

	public void setYear(int year){
		this.year = year; }

	public int getYear(){
		return year; }

	
	}	