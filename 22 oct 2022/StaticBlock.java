class First 
{
	First()
	{
		System.out.println("first class ctor ");
	}
	static {
		System.out.println("static block in first class ");
	}
}
class StaticBlock
{
	//static block 
	static
	{
		System.out.println("static block 1");
	}
	static
	{
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		First f1=new First();
	}
	
}