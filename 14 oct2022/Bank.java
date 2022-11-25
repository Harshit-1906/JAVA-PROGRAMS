import java.util.Scanner;
class Employee
{
	long acc,mno;
	String name;
	double bal;
	Employee(String n,long r,long p,double b)
	{
	
		name=n;
		mno=r;
		acc=p;
		bal=b;
	}

	void display()
	{
		System.out.println("Account no. is:-"+acc);
	 	System.out.println("Name is:-"+name);
	 	System.out.println("Mobile no. is:-"+mno);
	 	System.out.println("Account Balance is:-"+bal);
	}
	double withdrawal(double withdrawalmoney) 
	 {
	 	 bal = bal - withdrawalmoney;
	 	return bal;
	 }
	 double deposit(double depositmoney)
	 {
	 	 bal =bal + depositmoney;
	 	return bal;
	 }
}
class Bank
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Name=");
	 	String name=sc.next();
	 	System.out.println("Enter your Account No.=");
	 	long acc=sc.nextLong();
	 
	 	System.out.println("Enter your Mobile No.=");
	 	long mno=sc.nextLong();
	 	System.out.println("Enter your Account Balance=");
	 	double bal=sc.nextDouble();
		
		Employee s1=new Employee(name,mno,acc,bal);
		s1.display();
		System.out.println("after withdrwal "+s1.withdrawal(3500));
		System.out.println("after deposit "+s1.deposit(5000));
		
	}
	   
}