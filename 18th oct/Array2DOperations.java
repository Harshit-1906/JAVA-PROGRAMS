import java.util.Scanner;
class Array2DOperations	
{
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];

		
	void input2dArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2d array ");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				b[i][j]=sc.nextInt();
				
			}
		}
	}
	void display2dArray()
	{
		System.out.println("display 2d array ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}
	void diagonal()
	{

	}
	void transpose()
	{

	}
	void multiply()
	{
		for (int i=0;i<3 ;i++ ) {
			for (int j=0;j<3 ;j++ ) {
				c[i][j]=a[i][j]*b[i][j];
				System.out.println(c[i][j]);

			}
			
		}
		
	}
	
	void addition()
	{
		
		for (int i=0;i<3 ;i++ ) 
		{
			for (int j=0;j<3 ;j++ ) 
			{
				c[i][j]=a[i][j]+b[i][j];
				
			}
			
		}
		System.out.println("Addition of Matrix="+c[i][j]);

	}
	public static void main(String[] args) {
		
		Array2DOperations obj=new Array2DOperations();
		Scanner sc=new Scanner(System.in);
	
		while(true)
		{
			System.out.println("\n1.Input 2D Array\n2.Display 2D Array\n3.Diagonal of a Matrix\n4.Transpose of Matrix\n5.Multiplication of Matrix\n6.Addition of Matrix \n7.Exit");
			System.out.println("Enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:obj.input2dArray();
					break;
				case 2:obj.display2dArray();
					break;
				case 3:obj.diagonal();
					break;
				case 4:obj.transpose();
					break;
				case 5:obj.multiply();
					break;
				case 6:obj.addition();
					break;
				case 7:System.exit(0);
					break;
				
				default:System.out.println("wrong choice ");
					break;

			}

		}

		

		
	}
}