class Array2dDemo1	
{
	public static void main(String[] args) {
		int a[][]=new int[2][3];

		System.out.println("display 2d arraty ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=j*5;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}