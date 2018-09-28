package Reverse;

import java.util.Scanner;

public class ReadRever {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		String rev=strRev(str);
		System.out.println("The reverse of string is "+rev);
		}	
		public static String strRev(String str)
		{
			String temp="";
			for(int i=str.length()-1; i>=0; i--)
			{
				temp=temp+str.charAt(i);
			}
			return temp;
		}

	}


