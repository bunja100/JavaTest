class Child extends Test{
	private int mat;
	public Child(String name, String surname, int age, int mat){
		super(name, surname, age);
		this.mat = mat;
	}

	public String display(){
		return super.toString();
	}
	public static void main(String[] args) {
		Child c = new Child("Mariama", "kamaso", 20);
		System.out.println(c.toString1());
	}
}
