package april_long;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			long n=sc.nextInt();
			long k=sc.nextInt();
			String s=sc.next();
			if(n<k) {
				System.out.println("no");
				continue;
			}
			long current=0;
			int i;
			for(i=0;i<n;i++) {
				char ch=s.charAt(i);
				if(ch=='*') {
					current++;
				}
				else {
					current=0;
				}
				if(current>=k)
				{
					System.out.println("YES");
				   break;
				}
			}
			if(i==n)
				System.out.println("NO");
			
		}
		sc.close();

	}

}
