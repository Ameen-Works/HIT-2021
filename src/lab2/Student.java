package lab2;

public class Student {
String name, city;
int age;
static int m;
void printData() {
	System.out.println("Student name = "+name);
	System.out.println("Student city = "+city);
	System.out.println("Student age ="+age);
}
}
class Stest{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
			s1.name="arshath";
			s1.city="karaikal";
			s1.age=22;
			s2.name="ameen";
			s2.city="pondi";
			s2.age=22;
			s2.printData();
			
			s1.printData();
			Student.m=20;
			Student.m=22;
			Student.m=27;
				System.out.println("s1.m= "+Student.m);
				System.out.println("s2.m= "+Student.m);
		 		System.out.println("Student.m = "+Student.m);
		
	}
}