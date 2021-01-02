package jan_long;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		while(cases-->0) {
			int m,n;
			m=sc.nextInt();
			n=sc.nextInt();
			long arr1[]=new long[m];
			long arr2[]=new long[n];
			long sum1=0,sum2=0;
			for(int i=0;i<m;i++) {
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				arr2[i]=sc.nextInt();
			}
			for(int i=0;i<m;i++) {
				sum1+=arr1[i];
			}
			for(int i=0;i<n;i++) {
				sum2+=arr2[i];
			}
			if(sum1>sum2) {
				System.out.println("0");
			    continue;
			}
			long count=0;
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int i=0;
			int j=n-1;
			while(sum1<=sum2) {
				long temp=arr1[i];
				arr1[i]=arr2[j];
				arr2[j]=temp;
				sum1-=arr2[j];
				sum1+=arr1[i];
				sum2-=arr1[i];
				sum2+=arr2[j];
				count++;
				i++;
				j--;
			}
			System.out.println(count);
			
			
		}

		sc.close();
	}

}
