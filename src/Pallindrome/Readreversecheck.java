package Pallindrome;

import java.util.Scanner;

class Readreversecheck {

	public static void main(String[] args) {
		
		String str, rev="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		str=sc.nextLine();
		
		int length=str.length();
		
		for(int i=str.length()-1; i>=0; i--)
			rev=rev+str.charAt(i);
		
		if(str.equals(rev))
		{
			System.out.println(str+"is a pallindrome");
		}
		else
		{
			System.out.println(str+"is not a pallindrome");
		}	
		

	}

}
