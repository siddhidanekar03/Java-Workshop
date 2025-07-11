package com.app.demo3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			System.out.println("0.Exit");
			System.out.println("1. Writing data of one Product");
			System.out.println("2.Reading data of one Product");
			System.out.println("3. Writing data of Mutiple Product");
			System.out.println("4. reading data of Mutiple Product");
			
			switch (choice) {
			case 1: Product p = new Product(1, "iPhone16", 89000.0);
			String path = "D:\\\\siddhi\\dkte.txt";
			try(FileOutputStream fout = new FileOutputStream(path)) {
				try(DataOutputStream dout = new DataOutputStream(fout)) {
					dout.writeInt(p.getPid());
					dout.writeUTF(p.getName());
					dout.writeDouble(p.getPrice());
					System.out.println("File Saved.");
				} // dout.close();
			} // fout.close(); 
			catch (Exception e) {
				e.printStackTrace();
			}
		    break;
		    
				
			case 2: String path1 = "D:\\\\siddhi\\dkte.txt";
			try(FileInputStream fin = new FileInputStream(path1)) {
				try(DataInputStream din = new DataInputStream(fin)) {
					int id = din.readInt();
					String name = din.readUTF();
					double price = din.readDouble();
					Product p1 = new Product(id, name, price);
					System.out.println("File Read: " + p1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			    break;
		    
			case 3:List<Product> list = new ArrayList<>();
			list.add(new Product(1, "Prod1", 100.0));
			list.add(new Product(2, "Prod2", 200.0));
			list.add(new Product(3, "Prod3", 300.0));
			
			String path11 = "D:\\\\siddhi\\dkte.txt";
			try(FileOutputStream fout = new FileOutputStream(path11)) {
				try(DataOutputStream dout = new DataOutputStream(fout)) {
					for (Product p2 : list) {
						dout.writeInt(p2.getPid());
						dout.writeUTF(p2.getName());
						dout.writeDouble(p2.getPrice());					
					}
					System.out.println("File Saved.");
				} // dout.close();
			} // fout.close(); 
			catch (Exception e) {
				e.printStackTrace();
			}
			    break;

			case 4:List<Product> list1 = new ArrayList<>();
			String path3 = "D:\\siddhi\\dkte.txt";
			try(FileInputStream fin = new FileInputStream(path3)) {
				try(DataInputStream din = new DataInputStream(fin)) {
					while(true) {
						int id = din.readInt();
						String name = din.readUTF();
						double price = din.readDouble();
						Product p3 = new Product(id, name, price);
						list1.add(p3);
						System.out.println("File Read: " + p3);
					}
				}
			}
			catch (EOFException e) {
				System.out.println("All Records Read: " + list1.size());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			    break;
			    
			case 0: System.out.println("Exit");
			break;
			
			default:System.out.println("Wrong choice");
				break;
			}
			
			
		}while(choice != 0);
		

	}
}
