//super class
class First
{
	int a;
	void show()
	{
		System.out.println("this is show method in class First "+a);
	}
}
//sub class
class Second extends First
{
	int b;
	void display()
	{
		System.out.println("this is display method in class Second "+b);
	}
}
class SingleInheritance
{
	public static void main(String[] args) {
		Second sec=new Second();
		sec.show();
		sec.display();
		System.out.println(sec.a);
		System.out.println(sec.b);

	}
	
}