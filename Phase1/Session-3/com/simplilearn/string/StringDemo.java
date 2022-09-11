package com.simplilearn.string;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1= "Hello world";
		String s2= "Hello world";
		
		String s3= new String("hello world");
		String s4= new String("hello world");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);

	}

}
