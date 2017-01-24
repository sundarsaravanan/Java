import java.io.*;
import java.util.*;
public class sorting
{
	public static void main(String[]arg)
	{
		int a[]=new int[20];
		int temp,i,s,j;
		System.out.println("Sort the elements in an array");
		System.out.println("Enter number of elements:");
		Scanner M=new Scanner(System.in);
		s=M.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<s;i++)
		{
			a[i]=M.nextInt();
		}
		for(i=s-2;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting: ");
		for(i=0;i<s;i++)
			System.out.println(a[i]);
	}
}
