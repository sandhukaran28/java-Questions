package jan_long;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			int n,k,d;
			n=sc.nextInt();
			k=sc.nextInt();
			d=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++) {
				sum+=arr[i];
			}
			int res=sum/k;
			if(res>d) {
				res=d;
			}
			System.out.println(res);
		}
		sc.close();
	}

}
