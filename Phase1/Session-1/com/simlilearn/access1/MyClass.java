package com.simlilearn.access1;

public class MyClass {

	
		
		public int numPublic=10;
		public int numDefault=20; // default (in same package)
		public int numProtected=30;
		public int numPrivate=40;
		
		public static void main(String[] args) {
			//let's try to access them in same class
			MyClass obj= new MyClass(); //object created for MyClass
			System.out.println("Public: "+obj.numPublic);
			System.out.println("Default: "+obj.numDefault);
			System.out.println("Protected: "+obj.numProtected);
			System.out.println("Private: "+obj.numPrivate);
		
		// TODO Auto-generated method stub

	}

	
}


