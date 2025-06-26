package Assig2;

public class Date {
      private int date;
      private int month;
      private int year;
      
      public Date(int date, int month, int year) {
    	  this.date = date;
    	  this.month = month;
    	  this.year = year;
      }
      
      public void setDate(int date) {
    	  this.date = date;
      }
      public void setMonth(int month) {
    	  this.month = month;
      }
      public void setYear(int year) {
    	  this.year = year;
      }
      
      public int getDate() {
    	  return date;
      }
      public int getMonth() {
    	  return month;
      }
      public int getYear() {
    	  return year;
      }
      
      public void displayDate() {
    	  System.out.println("Date: "+ date+ " / " + month + " / " + year);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(21, 6, 2025);
		d.displayDate();
		

	}

}
