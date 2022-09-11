package com.simplilearn.inner;

public class LocalInnerClass {
	public void display() {
		class Inner{
			int num=10;
			void print() {
				System.out.println("Print method called from inner class");
				System.out.println("Value: "+num);
			}
		}
		Inner inner= new Inner();
		inner.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LocalInnerClass l= new LocalInnerClass();
 l.display();
	}

}
