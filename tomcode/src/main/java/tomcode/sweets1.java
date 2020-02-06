package tomcode;



	import java.util.Scanner;

	public class sweets1 extends Chocolates
		{
			int swee[][],n;
			String swee1[];
			int t;
			String t1[];
			Scanner s=new Scanner(System.in);
		void arrangeorder()
		{
		System.out.println("enter the number of sweetsventries");
		n=s.nextInt();
		swee=new int[n][2];
		swee1=new String[n];
		t1=new String[n];

		super.price();
		super.weight();

		for(int i=0;i<n;i++)
		{
			System.out.println("enter sweet name");
			swee1[i]=s.next();
			System.out.println("enter the sweet weights and price");
			swee[i][0]=s.nextInt();
			swee[i][1]=s.nextInt();
			}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
				if (swee[i][1]<swee[j][1])
				{t=swee[i][1];
				swee[i][1]=swee[j][1];
				swee[j][1]=t;
				
				t=swee[i][0];
				swee[i][0]=swee[j][0];
				swee[j][0]=t;
				
				t1[i]=swee1[i];
				swee1[i]=swee1[j];
				swee1[j]=t1[i];
					
				}
			}
		for(int i=0;i<n;i++)
		{
			System.out.println(swee1[i]);
			System.out.println(swee[i][0]);
			System.out.println(swee[i][1]);}

		}

		}






