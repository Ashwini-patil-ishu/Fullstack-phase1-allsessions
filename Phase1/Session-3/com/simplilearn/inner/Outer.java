package com.simplilearn.inner;

public class Outer {
	private int num=10;
	class Inner{
		int innerVariable=30;
		void display() {
			System.out.println("Inner class display method called");
			System.out.println("display: "+ innerVariable);
			System.out.println("can access outer class variable "+num);
		}
		class Depth{
			void print() {
				System.out.println("Depth class print method");
			}
		}
	}
public static void main(String[] args) {
	Outer outer= new Outer();
	Outer.Inner inner= outer.new Inner();
	inner.display();
	Outer.Inner.Depth depth= inner.new Depth();
	depth.print();
}
	}


