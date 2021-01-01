package jan_long;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			int n=sc.nextInt();
			String str=sc.next();
			String res="";
			while(n>0) {
			String s=str.substring(n-4, n);
			n-=4;
			char ch='a';
			int count=8;
			while(count>0) {
				int curr=Integer.parseInt(String.valueOf(s.charAt(0)));
				if(curr==1) {
					ch+=count;
				}
				count/=2;
				s=s.substring(1,s.length());
				
			}
			res+=ch;
			
			}
			StringBuilder builder=new StringBuilder(res);
			builder.reverse();
			System.out.println(builder.toString());
			
	
		}
		sc.close();

	}

}
