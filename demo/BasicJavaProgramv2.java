package demo;
import java.util.Scanner;
public class BasicJavaProgramv2 {
	public static void main(String[]args) {
	int num1 , num2 ;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter 1st number? ");
	num1= sc.nextInt();
	System.out.println("enter 2nd number?");
	num2= sc.nextInt();
	
	System.out.println("hello world");
	System.out.println("Arithmetic operations on the two numbers are");
	System.out.println("Addition of two numbers is:"+ (num1+num2));
	System.out.println("Substraction of two numbers is:"+ (num1-num2));
	System.out.println("Multiplicatiln of two numbers is:"+ (num1*num2));
	System.out.println("division of two numbers is:"+ (num1/num2));

}
}
