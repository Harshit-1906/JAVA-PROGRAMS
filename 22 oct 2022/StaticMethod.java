class MathOp
{
	static int max=100;
	int y;//non-static variable 
	static void display()
	{
		System.out.println("Max value "+max);
		//System.out.println("Non-static "+y);
	}
	//ono-static method 
	void foo()
	{
		System.out.println("stativ "+max);
		System.out.println("Non-static "+y);
	}
}
class StaticMethod
{
	static int min=10;
	int x;//non-static variable 
	static void show()
	{
		System.out.println("this is static method ");
	}
	public static void main(String[] args) {
		show();//static method call 
		System.out.println(MathOp.max);
		System.out.println(StaticMethod.min);
		MathOp.display();
		MathOp obj=new MathOp();
		obj.foo();
	}
}