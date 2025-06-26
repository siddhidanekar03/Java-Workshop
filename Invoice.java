package Assig2;

public class Invoice {
	private String pNumber;
	private String pDesp;
	private int quantity;
	private double price;
	

	public Invoice(String pNumber, String pDesp, int quantity, double price) {
		
		this.pNumber = pNumber;
		this.pDesp = pDesp;
		this.quantity = quantity;
		this.price = price;
	}
	
    public String getpNumber() {
    	
		return pNumber;
	}

	public void setpNumber(String pNumber) {
	
		this.pNumber = pNumber;
	}

	public String getpDesp() {
		return pDesp;
	}

	public void setpDesp(String pDesp) {
		this.pDesp = pDesp;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;
		}else {
		this.quantity = quantity;
		}
	}

	public double getPrice() {
		
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) {
			this.price = 0.0;
		}else {
			this.price = price;
		}
		
	}
	
	public double getTotalAmount() {
		return price*quantity;
		
	}
	
	public void display() {
		System.out.println("Item Part Number: "+ pNumber);
		System.out.println("Item Part Description: "+ pDesp);
		System.out.println("Quantity of item: "+ quantity);
		System.out.println("Price of per item: "+ price);
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice v = new Invoice("12","Broad",2,1200);
		v.display();
		System.out.println("Total Amount: "+ v.getTotalAmount());
	}

}
