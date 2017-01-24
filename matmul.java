import java.io.*;
import java.util.*;
public class matmul
{
	public static void main(String[]arg)
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Multiplication of two matrix");
		System.out.println("Enter First matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Scanner S=new Scanner(System.in);	
				a[i][j]=S.nextInt();
			}
		}
		System.out.println("Enter Second matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Scanner X=new Scanner(System.in);	
				b[i][j]=X.nextInt();
			}
		}
		System.out.println("Resultant matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
				c[i][j]=c[i][j]+a[j][k]*b[k][i];
				}
				System.out.print(c[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
