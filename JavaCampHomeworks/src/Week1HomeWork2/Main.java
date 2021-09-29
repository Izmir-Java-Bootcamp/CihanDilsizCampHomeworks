package Week1HomeWork2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the pattern string ex:'s*h*l'");
		 String pattern=sc.nextLine();
		 while(true){
			 System.out.println("Enter a string");
			 String str=sc.nextLine();
			 if(str.equals("exit")) {
				 System.out.println("Bye");
				 return;
			 }
			 if( occursIn(pattern, str)) {
				 System.out.println(pattern+" occurs in"+"'"+ str+"'");
			 }else {
				 System.out.println(pattern+" does Not occur in"+"'"+ str+"'");
			 }
			 
			 
		 }	 
	}
	public static boolean occursIn(String pattern, String str) {
		String pat="";
		for(int i=0;i<pattern.length();i++) {
			if(pattern.charAt(i)!=('*')) {
				pat+=pattern.charAt(i);
			}
		}
		int count=0;
		for(int i=0;i<pat.length();i++) {
			char letter=pat.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==(letter)) {
					count++;
					
					str=str.substring(j+1);
				}	
			}
			
		}
		if(count>=pat.length()) {
			return true;
		}
		 
			return false;
	 
	}
}
