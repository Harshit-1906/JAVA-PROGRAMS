interface Shape
{
	
	void area();
	void circumference();
}
class Rectangle implements Shape
{
	int l,b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		int a=l*b;
		System.out.println("Area of Rectangle="+a);
	}
	public void circumference()
	{
		int a=2*(l+b);
		System.out.println("Circumference of Rectangle"+a);
	}

}
class Circle implements Shape
{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	public void area()
	{
		double c=3.14*r*r;
		System.out.println("Area of Circle"+c);
	}
	public void circumference()
	{
		double c=2*3.14*r;
		System.out.println("Circumference of Circle"+c);
	}
}

class interfacedemo
{
	public static void main(String[] args) {
		Rectangle obj1=new Rectangle(2,3);
		obj1.area();
		obj1.circumference();
		Circle obj2=new Circle(5);
		obj2.area();
		obj2.circumference();
	}
}
