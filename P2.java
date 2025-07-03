package com.app.demo41;


class Box<T>{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}

public class P2 {

	
	
	
	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(new Integer(10));
		Integer i1 = (Integer) b1.getObj();
		System.out.println("i1- " + i1);
		
		Box<String> b2 = new Box<String>();
		b2.setObj(new String("sunbeam"));
		String s1 = b2.getObj();
		System.out.println("s1 = " + s1);
		
		Box b3 = new Box();
		b3.setObj(new Double(10.20));
		Double d1 = (Double) b3.getObj();
		System.out.println("d1- " + d1);
		
		
	}

}
	
	
	

