package epam.Collection;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Collection c=new Collection();
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1.Add\n2.remove\n3.fetch\n4.print\n5.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter how many elements");
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
					c.add(a[i]);
				}
				break;
			case 2:
				System.out.println("enter how many elements to remove");
				int n1=sc.nextInt();
				c.remove(n1);
				break;
			case 3:
				System.out.println("enter index");
				int n2=sc.nextInt();
				c.fetch(n2);
				break;
			case 4:
				c.print();
				break;
			case 5:
				System.exit(0);
			}
			
		}
		while(true);
		
	}

}
