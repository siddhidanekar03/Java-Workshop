package com.app.demo1;

import java.io.File;
import java.util.Scanner;

public class program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path:");
		String path = sc.next();
		File f = new File(path);
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println("File Name: " + f.getName());
				System.out.println("File Size: " +  f.length());
				System.out.println(("Last modified: " + f.lastModified()));
				
				
			}
			else if(f.isDirectory()) {
				System.out.println("Directory Name: " + f.getName());
				String[] files = f.list();
				for(String file : files) {
					System.out.println(file);
				}
			}
		}
		else {
			System.out.println("Invalid Path");
		}

	}

}
