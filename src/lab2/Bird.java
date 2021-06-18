package lab2;

public class Bird {
	int age;
	String name;
	public Bird() {
		// TODO Auto-generated constructor stub
		System.out.println("This is thne parrot");
	}
	public Bird (String x) {
		name=x;
		System.out.println("The name is= "+name);
	}
	public Bird (int y,String z) {
		age=y;
		name=z;
		System.out.println("The age is "+age+" and the name is ");
	}

	public static void main(String[] args) {
		new Bird();
		new Bird("Kozhi");
		new Bird(20,"Kaudhaari");

	}

}
