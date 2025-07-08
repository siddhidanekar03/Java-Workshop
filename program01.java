package com.app.demo1;

import java.util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;


class product{
	int pid;
	String name; 
	double price;
	
	public product() {
		
	}
	
	public product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, pid, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		product other = (product) obj;
		return Objects.equals(name, other.name) && pid == other.pid
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	 
}

public class program01 {
	
	public static void main(String[] args) {
		Set<product> pro = new LinkedHashSet<product>();
		pro.add(new product(1, "Pen", 15));
		pro.add(new product(2, "Pencil", 10));
		pro.add(new product(3, "Eraser", 5));
		pro.add(new product(4, "Ruler", 25));
		pro.add(new product(5, "Book", 50));
		pro.add(new product(5, "Book", 50));//product can not be duplicated 
		//to check the duplicates we need to override the hashCode() and toString() methods
		
		System.out.println("Size: " + pro.size());
		
		for(product p : pro) {
			System.out.println(p);
		}
		
		
		
		
		
		
	}
}
