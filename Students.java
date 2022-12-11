import java.util.*;
class Students
{
	double a,b;

	void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. of classes held");
		a = sc.nextDouble();
		System.out.println("Enter the no. of classes attended");
		b= sc.nextDouble();
	}
	void per()
	{
		double Percentage=(b/a)*100;
		System.out.println("Percentage=" + Percentage);
		 if ( Percentage >= 75)
           {
           	System.out.println("You can give exam");

           }
           else 
           {
           	System.out.println("You can't give exam");
           }

	}
	public static void main(String[] args) {
   
    	Students c = new Students();
    	c.getData();
    	c.per();
    }
}