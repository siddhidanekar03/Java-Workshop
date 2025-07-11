package com.app.demo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class program01 {

	public static void main1(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the to be written in file");
	String path = "C:/Users//Dell/Documents/DD/note.txt";
	try(FileOutputStream fout = new FileOutputStream(path)) {
		try(PrintStream pout = new PrintStream(fout)){
		pout.println(1234);
		pout.println(123.4);
		pout.println("Siddhi");
		
		while(true) {
			String line = sc.nextLine();
			if(line.isEmpty())
				break;
			pout.println(line);
		}System.out.println("File Saved");
		
	   } 
	} catch (IOException e) {
		
		e.printStackTrace();
	}

	}
	//"C:/Users//Dell/Documents/DD/note.txt";
	public static void main(String[] args) {
		String path = "C:/Users//Dell/Documents/DD/note.txt";
		String line = "";
		try(FileInputStream fin = new FileInputStream(path)){
			try(Scanner sc = new Scanner(fin)){
				while(sc.hasNext()) {
					line = sc.next();
					System.out.println(line);
				}
			}//sc close()
		}//fin close() 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		}
		
	}


