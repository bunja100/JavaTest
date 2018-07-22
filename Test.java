import java.util.Scanner;
class Test{
	private String firstname;
	private String lastname;
	private	 int age;

	public Test(String firstname, String lastname, int age){
		setName(firstname);
		setSurname(lastname);
		setAge(age);
	}

	public void setName(String name){
		this.firstname = name;
	}

	public void setSurname(String lastName){
		this.lastname = lastName;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String getFirstName(){
		return firstname;
	}

	public String getLastName(){
		return lastname;
	}

	public int getAge(){
		return age;
	}

	public String toString(){
		return  "First Name " + getFirstName() + "\n" +
				"Last Name " + getLastName() + "\n" + 
				"Age  " + getAge();
	}

	public static void main(String[] args) {
		Test t1 = new Test("Ebrima", "Jallow", 29);
		t1.setName("Lamin");
		System.out.println("Your firstname is " + t1.getFirstName());
	}
}