package Session5;

class Student{
	private String name;
	private int rollno;
	private int age;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Test {

	public static void main(String[] args) {
		
       Student obj=new Student();
       obj.getName();
       obj.getAge();
       obj.getRollno();
	}

}
