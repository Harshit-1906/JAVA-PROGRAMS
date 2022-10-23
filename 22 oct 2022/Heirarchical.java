//super class
class Base
{	
	int a;
	Base()
	{
		System.out.println("Base class ctor ");
		a=10;
	}
}
//sub class
class Child1 extends Base
{	
	int x;
	Child1()
	{
		System.out.println("Child1 class ctor ");
		x=100;
	}
	void show()
	{
		System.out.println(a+" "+x);
	}
}
//sub class
class Child2 extends Base
{	
	int b;
	Child2()
	{
		System.out.println("Child2 class ctor ");
		b=200;
	}
	void show()
	{
		System.out.println(a+" "+b);
	}
}

//sub class
class Child3 extends Base
{	
	int c;
	Child3()
	{
		System.out.println("Child3 class ctor ");
		c=300;
	}
	void show()
	{
		System.out.println(a+" "+c);
	}
}
class Heirarchical
{
	public static void main(String[] args) {
		Child1 ch=new Child1();
		ch.show();
		Child2 ch1=new Child2();
		ch1.show();
		Child3 ch2=new Child3();
		ch2.show();

	}
	
}