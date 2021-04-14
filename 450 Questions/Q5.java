package dsAlgo;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int index=0;
			for(int i=0;i<n;i++) {
				if(arr[i]>0)
				{
					index=i;
				 break;
				}
			}
			if(index==n-1) {
				print(arr);
				continue;
				
			}
			int pos=index;
			for(int i=pos;i<n;i++) {
				if(arr[i]<0) {
					arr[index]=arr[index]^arr[i];
					arr[i]=arr[index]^arr[i];
					arr[index]=arr[index]^arr[i];
					index++;
				}
			}
			print(arr);
			
				
			
			
		}
		sc.close();
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
