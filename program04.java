package com.app.demo3;

import java.util.StringTokenizer;

public class program04 {
	
	public static void main(String[] args) {
		
		String s = "www.sunbeaminfotech.com/placements";
		System.out.println("OG String-> " + s);
		System.out.println("Tokens - > ");
		
		StringTokenizer st = new StringTokenizer(s, "./",true);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			
		}
		
	}

}
