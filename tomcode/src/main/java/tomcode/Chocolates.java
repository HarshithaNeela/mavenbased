package tomcode;
import java.util.*;
public class Chocolates implements newyeargifts
	{
		int cprice0,cweight0,cprice1,cweight1;
		Scanner s=new Scanner(System.in);
	public void price()
		{
			System.out.println("enter the range of price");
			cprice0=s.nextInt();
			cprice1=s.nextInt();
			System.out.println("lower limit of price is"+cprice0+"heigher limit of price is"+cprice1);
			
		}
	public void weight()
		{
			System.out.println("enter the range of weights");
			cweight0=s.nextInt();
			cweight1=s.nextInt();
			System.out.println("lower limit of weight is"+cweight0+"heigher limit of weight is"+cweight1);
			
			
		}

	}


