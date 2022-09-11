package demo;

import java.util.Scanner;

public class DisplayingContent {
	public static void main(String[] args)
	{
		//Factoril program example
		//3!=1*2*3=6
		//5!=1*2*3*4*5=120
		
		//Declaring variables here
		int n;
		int fact_var =1;
		
		//creating scanner object here
		Scanner sc = new Scanner(System.in);
		
		//reading input fron the user
		System.out.println("Enter a number");
		n =sc.nextInt();
		
		//calcuting factorial
		//for(int i=1;i<=n;i++) {
		//	fact_var=fact_var*i;
		//}
		int i=1;
		while(i<=n) {
			fact_var *=i;//fact_var=fact_var *i
			i++;//i=i+1
		}
		
		//display factorial
		System.out.println("Factorial of the number "+n+" is:" +fact_var);
	}

}
