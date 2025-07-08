package com.app.demo2;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class program01 {

	public static void main(String[] args) {
	  Map<Integer, String> m = new TreeMap<>();
	  m.put(111, "Neha");
	  m.put(112, "Sanika");
	  m.put(113,  "Yukta");
	  m.put(114, "Revati");
	  m.put(115, "Siya");
	  m.put(115, "Siya");//duplicate keys are not allowed
	//m.put(115, "Siya");//duplicate values are allowed
	  m.put(115, "Riya");// If keys are duplicated it will replace the value
	  m.put(117 ,null);
	  m.put(118 ,null);
	  
	  
	 
	  
	  System.out.println("Display Keys-> ");
	  Set<Integer> keys = m.keySet();
	  for(Integer k : keys) {
		  System.out.println(k);
	  }
	  
	  System.out.println("Display Values-> ");
	 Collection<String> values = m.values();
	  for(String v : values) {
		  System.out.println(v);
	  }
	  
	  Set<Map.Entry<Integer, String>> entries = m.entrySet();
	  for(Map.Entry<Integer, String>e : entries ) {
		  System.out.println(e.getKey() + "-" + e.getValue());
	  }
	  
	  

	}

}
