class Stud
{
	int rno;
	String name;
	static String cname="MSU";
	double per;
	Stud(int rno,String name,double per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	void display()
	{
		System.out.println(rno+" "+name+" "+cname+" "+per);
	}

}
class StaticVariable
{
	public static void main(String[] args) {
		Stud s1=new Stud(1,"hally",67.5);
		Stud s2=new Stud(2,"dhruvi",68.5);
		Stud s3=new Stud(3,"rushi",69.5);
		s1.display();
		s2.display();
		s3.display();
		//System.out.println(Stud.cname);
	}
}