package Week1Homework1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		 
		 System.out.println("Oluþturulacak þekil için bir N deðeri girin");
		 
		 int n=sc.nextInt();
		 
		 String strFirstRow="";
		 
		 String strLastRow="";
		 
		 String strBody="";
		 
		 for(int i=0;i<n;i++) {
			 
			 if(n>1) {
				 strLastRow+="*";
			 }
			 
			 strFirstRow+="*";
			 
			 if(i>=n-2) 
				 continue;
			 
			 strBody+="*";
			 for(int j=0;j<(n-2);j++) {
				  if(i%2!=0&&j%2==0) {
					  strBody+=" ";
				  }
				  else if(i%2!=0&&j%2!=0) {
					  strBody+="+";
				  }
				  else if(i%2==0&&j%2!=0) {
					  strBody+=" ";
				  }else {
					  strBody+="+";
				  }
			 }
			 strBody+="*\n";
			  
		 }
		 String str=strFirstRow+"\n"+strBody+strLastRow;
		 
		 System.out.println(str);
		 
	}

}
