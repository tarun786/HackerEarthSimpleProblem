package welcome;

import java.util.Scanner;

public class MatrixProblem {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the rows");
		int m=sc.nextInt();
		
		System.out.println("enter the column");
		int n=sc.nextInt();
		
		int[][] matrix1=new int[m][n];
		int[][] matrix2=new int[m][n];
		
		int[][] sum=new int[m][n];
		
		System.out.println("enter the first matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix1[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("enter the second matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix2[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("sum is matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			
			}
			
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(sum[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}

}
