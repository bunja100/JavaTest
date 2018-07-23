class Child extends Test{
	public Child(String name, String surname, int age){
		super(name, surname, age);
	}

	public String display(){
		return super.toString();
	}
	public static void main(String[] args) {
		Child c = new Child("Mariama", "kamaso", 20);
		System.out.println(c.toString1());
	}
}
