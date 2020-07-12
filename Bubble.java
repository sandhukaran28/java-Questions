package first1;
import java.util.Scanner;
public class Bubble{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
          System.out.println("enter no. of elements");
          int n=sc.nextInt(),i,j;
          int arr[]=new int[n];
           System.out.println("Now enter elements");
           for(i=0;i<n;i++)
           {
        	   arr[i]=sc.nextInt();
           }
     for(i=0;i<n-1;i++)
     {
    	 for(j=0;j<n-1-i;j++)
    	 {
    		 if(arr[j+1]<arr[j])
    		 {
    			 int temp=arr[j+1];
    			 arr[j+1]=arr[j];
    			 arr[j]=temp;
    		 }
    	 }
     }
     for(int item: arr)
     {
    	 System.out.print(item+" ");
     }
	}

}
