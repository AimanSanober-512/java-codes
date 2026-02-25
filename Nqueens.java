import java.util.*;
import java.lang.*;
import java.io.*;
class Nqueens
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char a[][]=new char[n][n];
		for(int i=0;i<n;i++){
		    Arrays.fill(a[i],'.');
		}
		queen(0,n,a);
	}
	static void queen(int row,int n,char a[][])
	{
	    if(row==n)
	    {
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++){
	                System.out.print(a[i][j]+" ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	    for(int col=0;col<n;col++)
	    {
	        if(issafe(row,col,n,a))
	        {
	            a[row][col]='Q';
	            queen(row+1,n,a);
	            a[row][col]='.';
	        }
	    }
	}
	static boolean issafe(int row,int col,int n,char a[][]){
	    for(int i=0;i<n;i++){
	        if(a[i][col]=='Q') return false;
	    }
	    for(int i=row,j=col;i>=0&&j>=0;i--,j--)
	    {
	        if(a[i][j]=='Q') return false;
	    }
	    for(int i=row,j=col;i>=0&&j<n;i--,j++)
	    {
	        if(a[i][j]=='Q') return false;
	    }
	    return true;
	}
}
