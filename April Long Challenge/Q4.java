package april_long;
import java.util.*;
public class Q4 {
	static int zero=20,one=18,two=15,three=11;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long test=sc.nextLong();
		while(test-->0) {
			long n=sc.nextLong();
			if(n==0) {
				System.out.println("0");
				continue;
			}
			long sum=0;
			
			long div=(n-1)/4;
			System.out.println("div:"+div);
			if(div<1) {
				sum=top((int)n);
			}
			else {
				long bottom=div-2;
				
				if(bottom<0)
				{
					bottom=0;
				}
				else if(bottom==0) {
					bottom=1;
				}
				else
					bottom++;
				System.out.println("bottom"+bottom);
				long top=n%4;
				if(top==0) {
					top=4;
				}
				sum=bottom*4*three+(top*three)+(4-top)*two+top((int)top);
				
			}
			System.out.println(sum);
		}
		sc.close();

	}
	public static int top(int n) {
		int sum=0;
	switch(n) {
	case 1:{
		sum=zero;
		 break;
	}
	case 2:{
		sum=2*one;
		break;
	}
	case 3:{
		sum=two+2*one;
		break;
	}
	case 4:{
		sum=4*two;
		break;
	}
	}
	return sum;
	}

}
