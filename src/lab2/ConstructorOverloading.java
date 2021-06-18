package lab2;
class Cs{
	int p,q;
	public Cs() {
	}
	public Cs(int x,int y) {
		p=x;
		q=y;
	}
	public int add(int i,int j) {
		return i+j;
		
	}
	public int add(int i,int j, int k) {
		return i+j+k;
	}
	public float add(float f1,float f2) {
		return f1+f2;
	}

public void PrintData() {
	System.out.println("p= "+p);
	System.out.println("q= "+q);
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3,y=4,z=5;
		Cs c=new Cs();
		Cs c1=new Cs(x,z);
		c1.PrintData();
		float f1=2.4f,f2=5.3f;
		int k=c.add(x,y);
		int t=c.add(x,y,z);
		float ft=c.add(f1,f2);
		System.out.println("K= "+k);
		System.out.println("t= "+t);
		System.out.println("ft= "+ft);
	}
	}
}
