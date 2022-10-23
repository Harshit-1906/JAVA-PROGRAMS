//super class
class Parent
{	
	int a;
	Parent()
	{
		System.out.println("parent class ctor ");
		a=100;
	}
}
//sub class
class Child extends Parent
{
	int b;
	Child()
	{
		System.out.println("child class ctor ");
		b=200;
	}
	void show()
	{
		System.out.println(a+" "+b);
	}
}
class CtorHeirarchy
{
	public static void main(String[] args) {
		Child ch=new Child();
		ch.show();

	}
	
}