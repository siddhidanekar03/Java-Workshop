package com.app.demo1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable<Product>{
	
	int pid; 
	String name; 
	double price;
	
	public Product() {
		
	}
	
	

	public Product(int pid, String name, double price) {
	
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

		


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}



	@Override
	public int compareTo(Product o) {
		
		return this.pid - o.pid;
	}
	
}


public class p1 {

	public static void main(String[] args) {
		class ProductpriceComparator implements Comparator<Product>{

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.price, o1.price);
			}
			
		}
		
		ProductpriceComparator productprice = new ProductpriceComparator();
		
		Set<Product> p = new TreeSet<>(productprice);
		
		p.add(new Product(1, "Pen", 15));
		p.add(new Product(2, "Pencil", 10));
		p.add(new Product(3, "Eraser", 5));
		p.add(new Product(4, "Ruler", 25));
		p.add(new Product(5, "Book", 50));
		
System.out.println("Size: " + p.size());
		
		for(Product pro : p) {
			System.out.println(pro);
		}
		

	}

}
