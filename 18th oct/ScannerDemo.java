import java.util.Scanner;
class ScannerDemo	
{
	public static void main(String[] args) {
		int a[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2d arraty ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}

		System.out.println("display 2d arraty ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}