package com.dem01;
import java.util.Scanner;

public class Date {

	int day;
	int month;
	int year;
	
	public Date() {
	}
	
	
	public Date(int day, int month, int year) {
		this.day= day;
		this.month= month;
		this.year= year;
		}
	
	public void acceptDate(Scanner sc) {
		System.out.println("Enter the date: ");
		day = sc.nextInt();
		System.out.println("Enter the month: ");
		month = sc.nextInt();
		System.out.println(" Enter the year: ");
		year = sc.nextInt();
		
	}
	 public void displayDate() {
		 System.out.println("Date:" + day + " / " + month + " / " + year);
	 }
	 
	
}
