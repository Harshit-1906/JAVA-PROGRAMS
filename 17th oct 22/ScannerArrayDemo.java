import java.util.Scanner;
class ScannerArrayDemo
{
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
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