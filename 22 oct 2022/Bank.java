class Emp
{
	
	String name;
	int mno;
	static String branch="Ellora Park Vadodara";
	long acno;
	long balance;
	

 	Emp(String name,int mno,long acno,long balance)
	{
		this.name=name;
		this.mno=mno;
		this.acno=acno;
		this.balance=balance;
	}
	void display()
	{
		System.out.println(name+" "+mno+" "+branch+" "+acno+" "+balance);
	}

	
}
class Bank
{
	public static void main(String[] args) {
		Emp s1=new Emp("Harshit",9265783065,987452525,9874563);
		Emp s2=new Emp();
		Emp s2=new Emp();
		
	}
}