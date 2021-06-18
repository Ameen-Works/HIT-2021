package lab2;

public class Employee {
int EmpId;
String Emp;
Employee(int Id, String Name){
this.EmpId=Id;
this.Emp=Name;}
void info() {
	System.out.println("Employee Id ; "+EmpId+" Name : "+Emp);

}
public static void main(String[] args) {
	Employee obj1=new Employee(21112, "Arshath");
	Employee obj2=new Employee(21117, "Thariq");
	obj1.info();
	obj2.info();
}
}

