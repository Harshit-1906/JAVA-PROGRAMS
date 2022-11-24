import java.util.Scanner;
class NScannerArrayDemo
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no. of elements ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements ");
		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();//33
		}

		System.out.println("dispplay array ");
		for (int i=0; i<a.length;i++ ) {
			System.out.print(a[i]+"\t");
			
		}
	}
	
}