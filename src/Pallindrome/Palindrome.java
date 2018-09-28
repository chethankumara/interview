package Pallindrome;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121, reversedinteger=0, reminder, originalinteger;
		originalinteger=num;
		
		//reversed integer is stored in variable
		while(num!=0)
		{
			reminder=num%10;
			reversedinteger=reversedinteger*10+reminder;
			num/=10;
		}
		//palindrome of originalinteger and reversedinteger are equal
		
	if(originalinteger==reversedinteger)
		System.out.println(originalinteger +" is a Palindrome()");
	else
		System.out.println(originalinteger +" is not a Palindrome()");

	}

}
