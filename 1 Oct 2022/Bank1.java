import java.util.Scanner;

class Bank 
{ 

	String username = "admin";
	String pass = "admin";
	String mno;
	int acc;
	int balance;
	int damt;
	int wamt;

	void login()
	{
         Scanner s = new Scanner(System.in);
		System.out.println("enter the username");

		username = s.next();

		while(true)
		{
			if(username.equals("admin"))
			{
				System.out.println("correct username");
				break;
			}
			else 
			{
				System.out.println("invalid username");
				username = s.next();
			}
		}
		System.out.println("enter the pass");
		pass = s.next();
while(true)
		{
			if(pass.equals("admin"))
			{
				System.out.println("correct password");
				break;
			}
			else 
			{
				System.out.println("invalid password");
				pass= s.next();
			}
		}

  

	}


	void getdata()
	{
		Scanner s = new Scanner(System.in);


		System.out.println("enter the mno");
		mno = s.next();
		while(true)
		{
			if(mno.length()==10)
			{
				System.out.println("valid mno");
				break;
				
			}
			else{
				System.out.println("invalid mno pls eneter mno again ");
				mno=s.next();
			}
		}
		System.out.println("enter the acc");
		acc = s.nextInt();
		System.out.println("enter the balance");
		balance = s.nextInt();
		
		
		while(true)
		{
			if(wamt<balance)
			{
				System.out.println("valid wamt");
				break;
				
			}
			else{
				System.out.println("invalid wamt ");
				wamt=s.nextInt();
			}
		}


	}
	void display()
	{
		System.out.println("login successfully");
		System.out.println("your name is :" + name);
			System.out.println( "your acc is :" + acc);
			System.out.println( "your mno is :" + mno);
			System.out.println( "your balance is :" + balance);
	
	
	}

	void deposit(int damt)
	{
		balance = balance + damt ;
		System.out.println("your balance is" + balance);
	}
    void withdrawal( int wamt)
    {
    	balance = balance - wamt;
    	System.out.println("your current balance is " + balance);
    }



    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		Bank bobj=new Bank();

		bobj.login();
		while(true)
		{
			System.out.println("1.create acccount\n2.display\n3.deposit\n4.withdrawal\n5.exit");
			System.out.println("enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:bobj.getdata();
				break;
			case 2:bobj.display();
				break;
			case 3:System.out.println("enter the deposit amount ");
				int x=sc.nextInt();
				bobj.deposit(x);
				break;
			case 4:System.out.println("enter the withdrawal amount ");
				x=sc.nextInt();
				bobj.withdrawal(x);
				break;
			case 5:System.exit(0);
				break;
			default:System.out.println("wrong choice ");
				break;
			}
		}
	}
}