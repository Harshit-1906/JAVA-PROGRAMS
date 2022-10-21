import java.util.Scanner;
class TransposeMatrix	
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no. of rows and columns ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
	
		
		System.out.println("Enter matrix 1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("display matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"\t");
				
				
			}
			System.out.println();
			
		}
	
		System.out.println("display transpose matrix ");
		
		for(int j=0;j<col;j++)
		{
			for(int i=0;i<row;i++)
			{
			
					System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
			
		}
	}
}