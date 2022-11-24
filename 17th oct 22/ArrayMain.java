import java.util.Scanner;
class ArraysOperation
{
	//instance variables 
	int a[]=new int[10];
	int n;
	//input array 
	void inputArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no. of elements ");
		n=sc.nextInt();
	
		System.out.println("enter the array elements ");
		for (int i=0;i<n ;i++ ) {
			a[i]=sc.nextInt();//33
		}
	}
	void displayArray()
	{
		System.out.println("dispplay array ");
		for (int i=0; i<n;i++ ) {
			System.out.print(a[i]+"\t");
			
		}
	}
	void reverseArray()
	{
		for (int i=n-1;i>=0 ;i-- ) {
			System.out.print(a[i]+"\t");
		}
	}
	void sum()
	{
		int sum=0;
		for (int i=0;i<n ;i++ ) {
			 sum=sum+a[i];
			
			
		}
		System.out.println("sum of Array="+sum);

	}
	void minimum()
	{
		int max,min;
		max=min=a[0];
		for (int i=0;i<n ; i++) {
			if(min>a[i]) 
			{
				 min=a[i];
			}
			else if(max<a[i])
			{
				 max=a[i];
			}
			
		}
		System.out.println("Minimum Value of Array"+min);
		System.out.println("Maximum Value of Array"+max);
	}
	void swap()
	{
		int temp=0;
		{
			
                  temp=a[0];
                  a[0]=a[n-1];
                  a[n-1]=temp;

				
			
			System.out.println("a[0]="+a[0]);
			System.out.println("a[n-1]="+a[n-1]);
		}
	}
	void even()
	{
		for (int i=0;i<n ;i++ ) {
		if(	a[i]%2 == 0)
			{
				System.out.println(a[i]);
			}
         else 
         {
         	System.out.println("not an even no.");
         }
	


			
		}
	}
	void copy()
	{
		int b[]=new int[10];
		for (int i=0;i<n ;i++ ) {
			b[i]=a[i];
		

		}
		for (int i=0;i<n ;i++ ) {
			System.out.println("b[i]="+b[i]);
			
		}
	    
	    
	    
	    
	    
	    
	    
	    
	}



}
class ArrayMain
{
	public static void main(String[] args) {
		ArraysOperation obj=new ArraysOperation();
		Scanner sc=new Scanner(System.in);
	
		while(true)
		{
			System.out.println("\n1.input array\n2.display array\n3.reverse array\n4.Sum \n5.exit\n6.Min & Max\n7.Swapping\n8.even\n9.copy");
			System.out.println("enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:obj.inputArray();
					break;
				case 2:obj.displayArray();
					break;
				case 3:obj.reverseArray();
					break;
				case 4:obj.sum();
					break;
				case 5:System.exit(0);
					break;
				case 6:obj.minimum();
					break;
			    case 7:obj.swap();
			    	break;
			    case 8:obj.even();
			    	break;
			    case 9:obj.copy();
			    	break;
				default:System.out.println("wrong choice ");
					break;

			}

		}
	}
	
}