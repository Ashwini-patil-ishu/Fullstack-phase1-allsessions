package demo;

import java.util.Scanner;

public class QuizProgram {
	public static void main(String[] args) {
		//declaring variable here
		int n;
		while(true) {
		//creating scanner object here
		Scanner sc = new Scanner(System.in);
		System.out.println("who is the founder of Blue Origin");
		System.out.println("1. Bill gate \n2. tin Cook \n3. Nadella \n4. jeff Bezos \n5. Exit Program");
		
		//reading input here
		System.out.println("Enter your choice (1/2/3/4/5)");
		n = sc.nextInt();
		
		//validating user choice
		if(n== 4) {
			System.out.println("Congrasulation.!! You have gussed the correct answer");
			}
		else if(n==5) {
			break;
		}
		else {
			System.out.println("wrong ans. !! please try again");
		}
		
	}
	}

}
