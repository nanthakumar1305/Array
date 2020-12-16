import java.io.*;
import java.util.*;
public class array
{
	public static void main(String args[])
	{
		int a[][]=new int[50][50];
		int i,j;
		int n,m;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter no rows");
		n=inp.nextInt();
		System.out.println("Enter no colums");
		m=inp.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=inp.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}