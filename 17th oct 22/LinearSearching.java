import java.util.Scanner;
class LinearSearching
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no. of elements ");
		int n=sc.nextInt();
		int a[]=new int[10];
		//input 
		System.out.println("enter the array elements ");
		for (int i=0;i<n ;i++ ) {
			a[i]=sc.nextInt();//33
		}
		//display 
		System.out.println("dispplay array ");
		for (int i=0; i<n;i++ ) {
			System.out.print(a[i]+"\t");
			
		}
		System.out.println("enter the element u want to search ");
		int key=sc.nextInt();
		boolean flag=false ;
		int i;
		for (i=0;i<n ;i++ ) {

			if(a[i]==key)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(key+" is found at "+(i+1)+" psoition ");
		}
		else 
		{
			System.out.println(key+" not found ");
		}
	}
	
}