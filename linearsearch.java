import java.io.*;
import java.util.*;
public class linearsearch
{
	public static void main(String[]arg)
	{
		int a[]=new int[20];
		int flag=1,i;
		System.out.println("Search an element in the array");
		System.out.println("Enter number of elements:");
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int key=S.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
				{flag=1;
				break;}
			else
				flag=0;
		}
		if(flag==1)
				System.out.println("The element is found at position "+(i+1));

			else
				System.out.println("The element is not found");
}
}
