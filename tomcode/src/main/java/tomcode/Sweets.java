package tomcode;


	import java.util.Scanner;

	public class Sweets implements newyeargifts {

		int sprice0,sweight0,sprice1,sweight1;
		Scanner s=new Scanner(System.in);
	public void price()
		{
			System.out.println("enter the range of price");
			sprice0=s.nextInt();
			sprice1=s.nextInt();
			System.out.println("lower limit of price is"+sprice0+"heigher limit of price is"+sprice1);
		}
	public void weight()
		{
			System.out.println("enter the range of weights");
			sweight0=s.nextInt();
			sweight1=s.nextInt();
			System.out.println("lower limit of weight is"+sweight0+"heigher limit of weight is"+sweight1);
			
		}

	}


