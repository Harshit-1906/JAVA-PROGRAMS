import java.util.*;
class Operation
{
	int a, b;

	void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b= sc.nextInt();


	}
	  void add()
    {
    	int addition = a+b;
    	System.out.println("Addition="+addition);
    }
    void sub()
    {
    	int subtraction = a-b;
    	System.out.println("Subtraction="+subtraction);
    }
  void multi()
    {
    	int multiply = a*b;
    	System.out.println("Multiplication="+multiply);
    }
    void div()
    {
    	int div = a/b;
    	System.out.println("Division="+div);
    }
    void mod()
    {
    	int modulus = a%b;
    	System.out.println("Modulus="+modulus);
    }


    public static void main(String[] args) {
   
    	Operation c = new Operation();
    	 c.getData();
    	c.add();
    	c.sub();
    	c.multi();
    	c.div();
    	c.mod();
    }
}