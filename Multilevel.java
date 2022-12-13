//super class
class GrandFather
{	
	int a;
	GrandFather()
	{
		System.out.println("GrandFather class ctor ");
		a=100;
	}
}
//sub class
class Father extends GrandFather
{
	int b;
	Father()
	{
		System.out.println("Father class ctor ");
		b=200;
	}

}
class Son extends Father{
	int c;
	Son()
	{
		System.out.println("Son class ctor ");
		c=300;

	}
	void show()
	{
		System.out.println(a+" "+b+" "+c);
	}

}
class Multilevel
{
	public static void main(String[] args) {
		Son ch=new Son();
		ch.show();

	}
	
}