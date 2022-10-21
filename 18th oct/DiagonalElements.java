import java.util.Scanner;
class DiagonalElements	
{
	public static void main(String[] args) {
		int a[][]=new int[3][3];
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter matrix 1");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("display matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
				
				
			}
			System.out.println();
			
		}
	
		System.out.println("display diagonal elements  ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					System.out.print(a[i][j]+"\t");
				}
				
			}
			
		}
	}
}