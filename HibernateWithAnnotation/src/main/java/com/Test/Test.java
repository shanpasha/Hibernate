package com.Test;

public class Test {
	public static void main(String[] args) {
		
	String ch[]= {"A","B","C","D","E","F","g","k"};
	
	
		for(int i=0;i<=ch.length-1;i++) {
			
			if(ch[i].toUpperCase().equals(ch[i].toUpperCase())) {
				
				System.out.print(ch[i].toUpperCase()+"=1");
			}
			if(i!=ch.length) {System.out.print(",");}

			if(ch[i].toLowerCase().equals(ch[i].toLowerCase())) {
				
				System.out.print(ch[i].toLowerCase()+"=2");
				
			
				if(i!=ch.length-1) {System.out.print(",");}
			}
			
			
			
		}
		
		
		
	}

}
