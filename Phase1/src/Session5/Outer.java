package Session5;

public class Outer {
	
     private String msg="Wlcome to JAVA";
	 
     class Inner{
    	 void hello() {
    		 System.out.println(msg+", Lets us start learing inner class");
    	 }
     }
     public static void main(String[] args) {
		Outer obj=new Outer();
		Outer.Inner in=obj.new Inner();
				in.hello();

	}

}
