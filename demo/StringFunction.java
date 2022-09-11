package demo;

public class StringFunction {
	public static void main(String[] args) {
		
		//initialization string with string value
		String string_var1= "String Function Program";
		String string_var2="String Function";
		
		//commonly use string function
		System.out.println("String Operation are");
		
		//getting character at specific position
		System.out.println(string_var1.charAt(5));
		
		//getting unicode character at specific index
		System.out.println(string_var1.codePointAt(3));
		
		//getting unicode charaterbat before specific index
		System.out.println(string_var1.codePointBefore(1));
		
		//counting number of unicode character between the indexes given 
		System.out.println(string_var1.codePointCount(0, 5));
		
		//compare two string texicographically i.e based on unicode value
		System.out.println("string comparision function");
		
		System.out.println(string_var1.compareTo(string_var2));
		
		//compare two string texicographically ignoring the case
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		
		//Appends the string with another
		System.out.println("concatenated string");
		System.out.println(string_var1.concat(string_var2));
		
		//check whether a string contain another string
		System.out.println(string_var1.contains(string_var2));
		
		//check whether string ends with specific characters
		System.out.println(string_var1.endsWith(string_var2));
		
		//compare and returns true if the string are equal
		System.out.println(string_var1.equals(string_var2));
		
		//compare and returns true if the string are equal by ignoring the case
		System.out.println(string_var1.equalsIgnoreCase(string_var2));
		
		//hash code for a string is computed like this
		//s[0]*31^(n-1) + s[1]*31^(n-2)*....*s(n-1)
		System.out.println(string_var1.hashCode());
		
		//get the position of 1st occurrence of specific character
		System.out.println(string_var1.indexOf("Program"));
		
		//verify if string are equal
		String string_var3="";
		System.out.println(string_var3.isEmpty());
		
		// get position of last occurrence of specific character
		string_var3="functions program functions";
		System.out.println("last occurrence position");
		System.out.println(string_var3.indexOf("functions"));
		
		//get string length
		System.out.println(string_var1.length());
		
		//search string with specific value and replace with it
		System.out.println(string_var3.replace("function", "java"));
		System.out.println(string_var3);
		
		//verify string if start with given string
		System.out.println(string_var1.startsWith("string"));
		
		//convert string in lower case
		string_var1="Hellow World";
		System.out.println(string_var1.toLowerCase());
		
		//convert upper case
		System.out.println(string_var1.toUpperCase());
		
		//trim space before and all the string
		String string_var4="  hello world  ";
		System.out.println(string_var4);
		System.out.println(string_var4.trim());
		
		
		
	}

}
