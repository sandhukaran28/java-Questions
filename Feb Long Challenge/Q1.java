package feb_long;


import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
public class Q1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=10;i>0;i--){
		    if(t<i)
		    continue;
		    if(t%i==0)
		    {
		    System.out.println(i);
		    break;
		    }
		}
	}
}