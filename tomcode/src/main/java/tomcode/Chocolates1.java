package tomcode;
	import java.util.*;
	public class Chocolates1 extends Chocolates
	{
		int choco[][],n;
		String choco1[];
		int t;
		String t1[];
		Scanner s=new Scanner(System.in);
	void arrangeorder()
	{
	System.out.println("enter the number of chocolates entries");
	n=s.nextInt();
	choco=new int[n][2];
	choco1=new String[n];
	t1=new String[n];

	super.price();
	super.weight();

	for(int i=0;i<n;i++)
	{
		System.out.println("enter chocolate name");
		choco1[i]=s.next();
		System.out.println("enter the chocolate weights and price");
		choco[i][0]=s.nextInt();
		choco[i][1]=s.nextInt();
		}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
			if (choco[i][1]<choco[j][1])
			{t=choco[i][1];
			choco[i][1]=choco[j][1];
			choco[j][1]=t;
			
			t=choco[i][0];
			choco[i][0]=choco[j][0];
			choco[j][0]=t;
			
			t1[i]=choco1[i];
			choco1[i]=choco1[j];
			choco1[j]=t1[i];
				
			}
		}
	for(int i=0;i<n;i++)
	{
		System.out.println(choco1[i]);
		System.out.println(choco[i][0]);
		System.out.println(choco[i][1]);}

	}

	}



