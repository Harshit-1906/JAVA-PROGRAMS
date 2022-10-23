class Student
{
	int rno;
	String name,cname;
	double per;
	Student(int rno,String name,String cname,double per)
	{
		this.rno=rno;
		this.name=name;
		this.cname=cname;
		this.per=per;
	}
	void display()
	{
		System.out.println(rno+" "+name+" "+cname+" "+per);
	}

}
class WithoutStatic
{
	public static void main(String[] args) {
		Student s1=new Student(1,"hally","MSU",67.5);
		Student s2=new Student(2,"dhruvi","MSU",68.5);
		Student s3=new Student(3,"rushi","MSU",69.5);
		s1.display();
		s2.display();
		s3.display();
	}
}