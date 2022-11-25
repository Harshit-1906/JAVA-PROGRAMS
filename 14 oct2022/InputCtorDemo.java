import java.util.Scanner;
class Employee
{
	int rno;
	String name;
	double per;
	Employee(String n,int r,double p)
	{
	
		name=n;
		rno=r;
		per=p;
	}

	void display()
	{
		System.out.println(rno+" "+name+" "+per);
	}
}
class InputCtorDemo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,rno &per");
		/*String s=sc.next();
		int r=sc.nextInt();
		double p=sc.nextDouble();
		////create an object 
		//Employee s1=new Employee(r,s,p);*/
		Employee s1=new Employee(sc.next(),sc.nextInt(),sc.nextDouble());
		s1.display();
		
	}
	   
}