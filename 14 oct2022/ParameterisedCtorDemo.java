class Stud
{
	int rno;
	String name;
	double per;
	Stud(int r,String n,double p)
	{
		rno=r;
		name=n;
		per=p;
	}

	void display()
	{
		System.out.println(rno+" "+name+" "+per);
	}
}
class ParameterisedCtorDemo
{
	public static void main(String[] args) {
		//create an object 
		Stud s1=new Stud(101,"hally",45.6);
		s1.display();
		Stud s2=new Stud(102,"Rushi",68.6);
		s2.display();
		Stud s3=new Stud(103,"Harshit",65.6);
		s3.display();
		Stud s4=new Stud(104,"Dhruvi",55.6);
		s4.display();
	}
	   
}