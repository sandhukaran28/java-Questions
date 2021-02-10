package feb_long;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Q2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int test=sc.nextInt();
	while(test-->0){
	    int n=sc.nextInt();
	    long arr[]=new long[n];
	    
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    long x=arr[0];
	    long z=arr[n-1];
	    long sum=-1;
	    for(int i=1;i<n-1;i++){
	        long y=arr[i];
	    long temp=Math.abs(x-y)+Math.abs(y-z)+Math.abs(z-x);
	    if(temp>sum)
	    sum=temp;
	    }
	   
	    System.out.println(sum);
	}
	}
}