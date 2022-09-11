package com.simplilearn.access2;
import com.simlilearn.access1.MyClass;
public class WorldChild extends MyClass {

	public static void main(String[] args) {
		WorldChild obj = new WorldChild();
		System.out.println("Public: " + obj.numPublic);
		System.out.println("Default: " + obj.numDefault);
		System.out.println("Protected: " + obj.numProtected);
		System.out.println("Private: " + obj.numPrivate);
		// TODO Auto-generated method stub

	}

}
