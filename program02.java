package com.app.demo1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
	
	public Product(int pid) {
		this.pid = pid;
		// TODO Auto-generated constructor stub
	}


	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Product) {
			Product p = (Product) obj;
			if(this.pid == p.pid)
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.pid - o.pid;
	}
	 
 }

public class program02 {

	public static void main1(String[] args) {
		
		List<Product>p = new ArrayList<Product>();
		p.add(new Product(1, " Pen", 20));
		p.add(new Product(2, " Pencil", 10));
		p.add(new Product(3, " Eraser", 5));
		p.add(new Product(4, " Ruler", 15));
		p.add(new Product(5, " Book", 50));
		
		System.out.println("Before Sorting: ");
		for(Product pro : p) {
			System.out.println(pro);
		}
		
		class ProductPriceComparator implements Comparator<Product>{

			@Override
			public int compare(Product o1, Product o2) {
				
				return Double.compare(o1.price, o2.price);
			}
					
		}
		
		ProductPriceComparator pricecomparator = new ProductPriceComparator();
		Collections.sort(p,pricecomparator);
		
		System.out.println("After Sorting: ");
		for(Product pro : p) {
			System.out.println(pro);
		}
		
		
	}
	
public static void main2(String[] args) {
		
		List<Product>p = new ArrayList<Product>();
		p.add(new Product(1, " Pen", 20));
		p.add(new Product(5, " Pencil", 10));
		p.add(new Product(3, " Eraser", 5));
		p.add(new Product(2, " Ruler", 15));
		p.add(new Product(4, " Book", 50));
		
		System.out.println("Before Sorting: ");
		for(Product pro : p) {
			System.out.println(pro);
		}
		
		Collections.sort(p);
		
		System.out.println("After Sorting: ");
		for(Product pro : p) {
			System.out.println(pro);
		}

	}



public static void main(String[] args) {
	List<Product> products = new ArrayList<>();
	products.add(new Product(5, "Pen", 15));
	products.add(new Product(2, "Pencil", 5));
	products.add(new Product(4, "Book", 50));
	products.add(new Product(1, "Eraser", 8));
	products.add(new Product(3, "Ruler", 12));

	products.remove(new Product(1));//removes eraser
	products.remove(2);//removes book

	for (Product product : products)
		System.out.println(product);
}

public static void main3(String[] args) {
	List<Product> products = new ArrayList<>();
	products.add(new Product(5, "Pen", 15));
	products.add(new Product(2, "Pencil", 5));
	products.add(new Product(4, "Book", 50));
	products.add(new Product(1, "Eraser", 8));
	products.add(new Product(3, "Ruler", 12));

	for (Product product : products)
		System.out.println(product);

	System.out.println("product at index 2 = " + products.get(2));
	System.out.println("index of product with id 4 = " + products.indexOf(new Product(4)));

}

}
